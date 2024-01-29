// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCompareDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCompareDetailResponseBody body;

    public static GetCompareDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompareDetailResponse self = new GetCompareDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCompareDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompareDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCompareDetailResponse setBody(GetCompareDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompareDetailResponseBody getBody() {
        return this.body;
    }

}
