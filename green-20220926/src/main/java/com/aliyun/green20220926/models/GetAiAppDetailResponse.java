// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiAppDetailResponseBody body;

    public static GetAiAppDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailResponse self = new GetAiAppDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiAppDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiAppDetailResponse setBody(GetAiAppDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiAppDetailResponseBody getBody() {
        return this.body;
    }

}
