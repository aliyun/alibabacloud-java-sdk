// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateFaceDbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFaceDbResponseBody body;

    public static CreateFaceDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceDbResponse self = new CreateFaceDbResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaceDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFaceDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFaceDbResponse setBody(CreateFaceDbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFaceDbResponseBody getBody() {
        return this.body;
    }

}
