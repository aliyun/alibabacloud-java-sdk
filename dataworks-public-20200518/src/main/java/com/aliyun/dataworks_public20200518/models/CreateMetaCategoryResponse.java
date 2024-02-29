// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetaCategoryResponseBody body;

    public static CreateMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCategoryResponse self = new CreateMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetaCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetaCategoryResponse setBody(CreateMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
