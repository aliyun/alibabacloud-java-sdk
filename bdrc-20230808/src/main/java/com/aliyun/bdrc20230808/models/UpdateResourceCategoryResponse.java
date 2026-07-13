// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateResourceCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceCategoryResponseBody body;

    public static UpdateResourceCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceCategoryResponse self = new UpdateResourceCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceCategoryResponse setBody(UpdateResourceCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceCategoryResponseBody getBody() {
        return this.body;
    }

}
