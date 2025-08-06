// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventStreamingBusinessOptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventStreamingBusinessOptionResponseBody body;

    public static UpdateEventStreamingBusinessOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStreamingBusinessOptionResponse self = new UpdateEventStreamingBusinessOptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventStreamingBusinessOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventStreamingBusinessOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventStreamingBusinessOptionResponse setBody(UpdateEventStreamingBusinessOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventStreamingBusinessOptionResponseBody getBody() {
        return this.body;
    }

}
