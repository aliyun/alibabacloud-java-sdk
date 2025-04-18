// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocExtractionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocExtractionTaskResponseBody body;

    public static SubmitDocExtractionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocExtractionTaskResponse self = new SubmitDocExtractionTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocExtractionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocExtractionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocExtractionTaskResponse setBody(SubmitDocExtractionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocExtractionTaskResponseBody getBody() {
        return this.body;
    }

}
