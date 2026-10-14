// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateWatermarkEmbedTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWatermarkEmbedTaskResponseBody body;

    public static CreateWatermarkEmbedTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWatermarkEmbedTaskResponse self = new CreateWatermarkEmbedTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateWatermarkEmbedTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWatermarkEmbedTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWatermarkEmbedTaskResponse setBody(CreateWatermarkEmbedTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWatermarkEmbedTaskResponseBody getBody() {
        return this.body;
    }

}
