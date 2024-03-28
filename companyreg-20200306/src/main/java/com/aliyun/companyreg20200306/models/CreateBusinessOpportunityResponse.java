// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CreateBusinessOpportunityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBusinessOpportunityResponseBody body;

    public static CreateBusinessOpportunityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOpportunityResponse self = new CreateBusinessOpportunityResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOpportunityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBusinessOpportunityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBusinessOpportunityResponse setBody(CreateBusinessOpportunityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBusinessOpportunityResponseBody getBody() {
        return this.body;
    }

}
