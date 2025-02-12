// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePostPayInstanceResponseBody body;

    public static CreatePostPayInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePostPayInstanceResponse self = new CreatePostPayInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePostPayInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePostPayInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePostPayInstanceResponse setBody(CreatePostPayInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePostPayInstanceResponseBody getBody() {
        return this.body;
    }

}
