// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDecodeBlindWatermarkResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDecodeBlindWatermarkResultResponseBody body;

    public static GetDecodeBlindWatermarkResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDecodeBlindWatermarkResultResponse self = new GetDecodeBlindWatermarkResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDecodeBlindWatermarkResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDecodeBlindWatermarkResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDecodeBlindWatermarkResultResponse setBody(GetDecodeBlindWatermarkResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDecodeBlindWatermarkResultResponseBody getBody() {
        return this.body;
    }

}
