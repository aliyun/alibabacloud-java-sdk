// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemTimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProblemTimelineResponseBody body;

    public static DeleteProblemTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemTimelineResponse self = new DeleteProblemTimelineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProblemTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProblemTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProblemTimelineResponse setBody(DeleteProblemTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProblemTimelineResponseBody getBody() {
        return this.body;
    }

}
