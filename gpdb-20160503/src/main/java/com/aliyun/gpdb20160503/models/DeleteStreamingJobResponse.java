// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStreamingJobResponseBody body;

    public static DeleteStreamingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingJobResponse self = new DeleteStreamingJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStreamingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStreamingJobResponse setBody(DeleteStreamingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStreamingJobResponseBody getBody() {
        return this.body;
    }

}
