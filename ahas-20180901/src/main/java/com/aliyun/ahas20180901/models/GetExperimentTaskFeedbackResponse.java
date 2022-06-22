// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetExperimentTaskFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetExperimentTaskFeedbackResponseBody body;

    public static GetExperimentTaskFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentTaskFeedbackResponse self = new GetExperimentTaskFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentTaskFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentTaskFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentTaskFeedbackResponse setBody(GetExperimentTaskFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentTaskFeedbackResponseBody getBody() {
        return this.body;
    }

}
