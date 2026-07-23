// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventAnalysisJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventAnalysisJobResponseBody body;

    public static DeleteEventAnalysisJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventAnalysisJobResponse self = new DeleteEventAnalysisJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventAnalysisJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventAnalysisJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventAnalysisJobResponse setBody(DeleteEventAnalysisJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventAnalysisJobResponseBody getBody() {
        return this.body;
    }

}
