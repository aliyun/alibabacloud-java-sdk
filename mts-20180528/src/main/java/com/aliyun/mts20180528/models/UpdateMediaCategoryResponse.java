// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateMediaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaCategoryResponseBody body;

    public static UpdateMediaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCategoryResponse self = new UpdateMediaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaCategoryResponse setBody(UpdateMediaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaCategoryResponseBody getBody() {
        return this.body;
    }

}
