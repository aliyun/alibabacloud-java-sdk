// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DissociateIpFromConnectionPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateIpFromConnectionPoolResponseBody body;

    public static DissociateIpFromConnectionPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpFromConnectionPoolResponse self = new DissociateIpFromConnectionPoolResponse();
        return TeaModel.build(map, self);
    }

    public DissociateIpFromConnectionPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateIpFromConnectionPoolResponse setBody(DissociateIpFromConnectionPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateIpFromConnectionPoolResponseBody getBody() {
        return this.body;
    }

}
