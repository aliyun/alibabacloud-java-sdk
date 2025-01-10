// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnAssociateVpdCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnAssociateVpdCidrBlockResponseBody body;

    public static UnAssociateVpdCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateVpdCidrBlockResponse self = new UnAssociateVpdCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public UnAssociateVpdCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnAssociateVpdCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnAssociateVpdCidrBlockResponse setBody(UnAssociateVpdCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public UnAssociateVpdCidrBlockResponseBody getBody() {
        return this.body;
    }

}
