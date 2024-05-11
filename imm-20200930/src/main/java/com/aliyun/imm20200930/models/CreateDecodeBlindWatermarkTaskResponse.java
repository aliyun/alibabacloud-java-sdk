// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDecodeBlindWatermarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDecodeBlindWatermarkTaskResponseBody body;

    public static CreateDecodeBlindWatermarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDecodeBlindWatermarkTaskResponse self = new CreateDecodeBlindWatermarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDecodeBlindWatermarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDecodeBlindWatermarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDecodeBlindWatermarkTaskResponse setBody(CreateDecodeBlindWatermarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDecodeBlindWatermarkTaskResponseBody getBody() {
        return this.body;
    }

}
