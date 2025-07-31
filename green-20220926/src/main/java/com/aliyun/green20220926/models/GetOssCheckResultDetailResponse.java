// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssCheckResultDetailResponseBody body;

    public static GetOssCheckResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckResultDetailResponse self = new GetOssCheckResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOssCheckResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssCheckResultDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssCheckResultDetailResponse setBody(GetOssCheckResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssCheckResultDetailResponseBody getBody() {
        return this.body;
    }

}
