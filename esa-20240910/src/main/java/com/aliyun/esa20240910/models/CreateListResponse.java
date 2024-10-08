// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateListResponseBody body;

    public static CreateListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateListResponse self = new CreateListResponse();
        return TeaModel.build(map, self);
    }

    public CreateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateListResponse setBody(CreateListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateListResponseBody getBody() {
        return this.body;
    }

}
