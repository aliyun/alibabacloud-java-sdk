// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitLiveEditingJobResponseBody body;

    public static SubmitLiveEditingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingJobResponse self = new SubmitLiveEditingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitLiveEditingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitLiveEditingJobResponse setBody(SubmitLiveEditingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitLiveEditingJobResponseBody getBody() {
        return this.body;
    }

}
