// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateIssueCategoryReportRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIssueCategoryReportRelationResponseBody body;

    public static CreateIssueCategoryReportRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIssueCategoryReportRelationResponse self = new CreateIssueCategoryReportRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateIssueCategoryReportRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIssueCategoryReportRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIssueCategoryReportRelationResponse setBody(CreateIssueCategoryReportRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIssueCategoryReportRelationResponseBody getBody() {
        return this.body;
    }

}
