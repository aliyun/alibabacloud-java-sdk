// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateImageDefectDetectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageDefectDetectionTaskResponseBody body;

    public static CreateImageDefectDetectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDefectDetectionTaskResponse self = new CreateImageDefectDetectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageDefectDetectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageDefectDetectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageDefectDetectionTaskResponse setBody(CreateImageDefectDetectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageDefectDetectionTaskResponseBody getBody() {
        return this.body;
    }

}
