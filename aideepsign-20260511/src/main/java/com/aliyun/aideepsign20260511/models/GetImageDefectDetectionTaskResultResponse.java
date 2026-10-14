// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageDefectDetectionTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageDefectDetectionTaskResultResponseBody body;

    public static GetImageDefectDetectionTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageDefectDetectionTaskResultResponse self = new GetImageDefectDetectionTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetImageDefectDetectionTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageDefectDetectionTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageDefectDetectionTaskResultResponse setBody(GetImageDefectDetectionTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageDefectDetectionTaskResultResponseBody getBody() {
        return this.body;
    }

}
