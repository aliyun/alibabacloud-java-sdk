// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitTableUnderstandingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTableUnderstandingJobResponseBody body;

    public static SubmitTableUnderstandingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTableUnderstandingJobResponse self = new SubmitTableUnderstandingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTableUnderstandingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTableUnderstandingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTableUnderstandingJobResponse setBody(SubmitTableUnderstandingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTableUnderstandingJobResponseBody getBody() {
        return this.body;
    }

}
