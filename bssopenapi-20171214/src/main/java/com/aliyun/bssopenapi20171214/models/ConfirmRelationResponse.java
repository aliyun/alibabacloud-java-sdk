// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConfirmRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmRelationResponseBody body;

    public static ConfirmRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRelationResponse self = new ConfirmRelationResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmRelationResponse setBody(ConfirmRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmRelationResponseBody getBody() {
        return this.body;
    }

}
