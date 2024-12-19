// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCategoryListResponseBody body;

    public static GetCategoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryListResponse self = new GetCategoryListResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCategoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCategoryListResponse setBody(GetCategoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCategoryListResponseBody getBody() {
        return this.body;
    }

}
