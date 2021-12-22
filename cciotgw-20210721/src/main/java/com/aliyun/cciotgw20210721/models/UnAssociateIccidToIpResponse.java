// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class UnAssociateIccidToIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnAssociateIccidToIpResponseBody body;

    public static UnAssociateIccidToIpResponse build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateIccidToIpResponse self = new UnAssociateIccidToIpResponse();
        return TeaModel.build(map, self);
    }

    public UnAssociateIccidToIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnAssociateIccidToIpResponse setBody(UnAssociateIccidToIpResponseBody body) {
        this.body = body;
        return this;
    }
    public UnAssociateIccidToIpResponseBody getBody() {
        return this.body;
    }

}
