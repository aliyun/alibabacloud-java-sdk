// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamingJobResponseBody body;

    public static CreateStreamingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingJobResponse self = new CreateStreamingJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamingJobResponse setBody(CreateStreamingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamingJobResponseBody getBody() {
        return this.body;
    }

}
