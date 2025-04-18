// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitVLExtractionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVLExtractionTaskResponseBody body;

    public static SubmitVLExtractionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVLExtractionTaskResponse self = new SubmitVLExtractionTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVLExtractionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVLExtractionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVLExtractionTaskResponse setBody(SubmitVLExtractionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVLExtractionTaskResponseBody getBody() {
        return this.body;
    }

}
