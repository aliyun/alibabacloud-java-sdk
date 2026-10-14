// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetWatermarkEmbedTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWatermarkEmbedTaskResultResponseBody body;

    public static GetWatermarkEmbedTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkEmbedTaskResultResponse self = new GetWatermarkEmbedTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetWatermarkEmbedTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWatermarkEmbedTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWatermarkEmbedTaskResultResponse setBody(GetWatermarkEmbedTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWatermarkEmbedTaskResultResponseBody getBody() {
        return this.body;
    }

}
