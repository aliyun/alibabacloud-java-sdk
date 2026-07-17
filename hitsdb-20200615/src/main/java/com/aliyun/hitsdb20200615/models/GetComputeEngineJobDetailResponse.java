// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetComputeEngineJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeEngineJobDetailResponseBody body;

    public static GetComputeEngineJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeEngineJobDetailResponse self = new GetComputeEngineJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeEngineJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeEngineJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeEngineJobDetailResponse setBody(GetComputeEngineJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeEngineJobDetailResponseBody getBody() {
        return this.body;
    }

}
