// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteNetworkInsightsAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkInsightsAnalysisResponseBody body;

    public static DeleteNetworkInsightsAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInsightsAnalysisResponse self = new DeleteNetworkInsightsAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInsightsAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkInsightsAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkInsightsAnalysisResponse setBody(DeleteNetworkInsightsAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkInsightsAnalysisResponseBody getBody() {
        return this.body;
    }

}
