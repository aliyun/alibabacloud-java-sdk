// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssociateVpdCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateVpdCidrBlockResponseBody body;

    public static AssociateVpdCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpdCidrBlockResponse self = new AssociateVpdCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public AssociateVpdCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateVpdCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateVpdCidrBlockResponse setBody(AssociateVpdCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateVpdCidrBlockResponseBody getBody() {
        return this.body;
    }

}
