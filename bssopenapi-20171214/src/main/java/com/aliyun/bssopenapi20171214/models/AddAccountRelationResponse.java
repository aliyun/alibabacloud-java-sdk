// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AddAccountRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAccountRelationResponseBody body;

    public static AddAccountRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAccountRelationResponse self = new AddAccountRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddAccountRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAccountRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAccountRelationResponse setBody(AddAccountRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAccountRelationResponseBody getBody() {
        return this.body;
    }

}
