// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetWatermarkExtractTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWatermarkExtractTaskResultResponseBody body;

    public static GetWatermarkExtractTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkExtractTaskResultResponse self = new GetWatermarkExtractTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetWatermarkExtractTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWatermarkExtractTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWatermarkExtractTaskResultResponse setBody(GetWatermarkExtractTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWatermarkExtractTaskResultResponseBody getBody() {
        return this.body;
    }

}
