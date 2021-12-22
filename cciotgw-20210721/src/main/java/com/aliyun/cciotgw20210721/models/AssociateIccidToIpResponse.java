// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AssociateIccidToIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateIccidToIpResponseBody body;

    public static AssociateIccidToIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateIccidToIpResponse self = new AssociateIccidToIpResponse();
        return TeaModel.build(map, self);
    }

    public AssociateIccidToIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateIccidToIpResponse setBody(AssociateIccidToIpResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateIccidToIpResponseBody getBody() {
        return this.body;
    }

}
