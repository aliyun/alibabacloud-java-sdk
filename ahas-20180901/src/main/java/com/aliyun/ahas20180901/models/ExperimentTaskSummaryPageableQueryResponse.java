// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ExperimentTaskSummaryPageableQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExperimentTaskSummaryPageableQueryResponseBody body;

    public static ExperimentTaskSummaryPageableQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExperimentTaskSummaryPageableQueryResponse self = new ExperimentTaskSummaryPageableQueryResponse();
        return TeaModel.build(map, self);
    }

    public ExperimentTaskSummaryPageableQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExperimentTaskSummaryPageableQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExperimentTaskSummaryPageableQueryResponse setBody(ExperimentTaskSummaryPageableQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExperimentTaskSummaryPageableQueryResponseBody getBody() {
        return this.body;
    }

}
