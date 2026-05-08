// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAICoachTaskReportResponseBody body;

    public static CreateAICoachTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskReportResponse self = new CreateAICoachTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAICoachTaskReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAICoachTaskReportResponse setBody(CreateAICoachTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAICoachTaskReportResponseBody getBody() {
        return this.body;
    }

}
