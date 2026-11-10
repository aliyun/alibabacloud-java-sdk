// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayQuotaRuleSubjectUsageExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody body;

    public static CreateGatewayQuotaRuleSubjectUsageExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayQuotaRuleSubjectUsageExportTaskResponse self = new CreateGatewayQuotaRuleSubjectUsageExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponse setBody(CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody getBody() {
        return this.body;
    }

}
