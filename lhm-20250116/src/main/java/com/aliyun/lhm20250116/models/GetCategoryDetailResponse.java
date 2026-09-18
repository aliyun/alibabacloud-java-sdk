// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetCategoryDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCategoryDetailResponseBody body;

    public static GetCategoryDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryDetailResponse self = new GetCategoryDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoryDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCategoryDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCategoryDetailResponse setBody(GetCategoryDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCategoryDetailResponseBody getBody() {
        return this.body;
    }

}
