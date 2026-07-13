// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetResourceCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceCategoryResponseBody body;

    public static GetResourceCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCategoryResponse self = new GetResourceCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceCategoryResponse setBody(GetResourceCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceCategoryResponseBody getBody() {
        return this.body;
    }

}
