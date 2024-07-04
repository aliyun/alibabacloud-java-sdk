// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateCategoryNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCategoryNameResponseBody body;

    public static UpdateCategoryNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryNameResponse self = new UpdateCategoryNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCategoryNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCategoryNameResponse setBody(UpdateCategoryNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCategoryNameResponseBody getBody() {
        return this.body;
    }

}
