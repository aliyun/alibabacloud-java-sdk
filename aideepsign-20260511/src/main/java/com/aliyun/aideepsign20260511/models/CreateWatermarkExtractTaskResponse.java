// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateWatermarkExtractTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWatermarkExtractTaskResponseBody body;

    public static CreateWatermarkExtractTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWatermarkExtractTaskResponse self = new CreateWatermarkExtractTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateWatermarkExtractTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWatermarkExtractTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWatermarkExtractTaskResponse setBody(CreateWatermarkExtractTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWatermarkExtractTaskResponseBody getBody() {
        return this.body;
    }

}
