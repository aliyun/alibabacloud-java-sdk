// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProblemTimelineResponseBody body;

    public static CreateProblemTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemTimelineResponse self = new CreateProblemTimelineResponse();
        return TeaModel.build(map, self);
    }

    public CreateProblemTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProblemTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProblemTimelineResponse setBody(CreateProblemTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProblemTimelineResponseBody getBody() {
        return this.body;
    }

}
