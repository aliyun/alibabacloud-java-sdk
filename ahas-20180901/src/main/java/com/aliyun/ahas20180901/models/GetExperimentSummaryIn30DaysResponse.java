// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetExperimentSummaryIn30DaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetExperimentSummaryIn30DaysResponseBody body;

    public static GetExperimentSummaryIn30DaysResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentSummaryIn30DaysResponse self = new GetExperimentSummaryIn30DaysResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentSummaryIn30DaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentSummaryIn30DaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentSummaryIn30DaysResponse setBody(GetExperimentSummaryIn30DaysResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentSummaryIn30DaysResponseBody getBody() {
        return this.body;
    }

}
