// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProblemTimelineResponseBody body;

    public static UpdateProblemTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemTimelineResponse self = new UpdateProblemTimelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProblemTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProblemTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProblemTimelineResponse setBody(UpdateProblemTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemTimelineResponseBody getBody() {
        return this.body;
    }

}
