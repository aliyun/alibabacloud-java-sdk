// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductTagsResponseBody body;

    public static CreateProductTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTagsResponse self = new CreateProductTagsResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductTagsResponse setBody(CreateProductTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductTagsResponseBody getBody() {
        return this.body;
    }

}
