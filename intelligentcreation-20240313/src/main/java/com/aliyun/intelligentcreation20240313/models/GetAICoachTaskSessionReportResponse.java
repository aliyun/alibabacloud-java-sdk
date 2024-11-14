// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachTaskSessionReportResponseBody body;

    public static GetAICoachTaskSessionReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionReportResponse self = new GetAICoachTaskSessionReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachTaskSessionReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachTaskSessionReportResponse setBody(GetAICoachTaskSessionReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachTaskSessionReportResponseBody getBody() {
        return this.body;
    }

}
