// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAggregateCompliancePackResponseBody body;

    public static CreateAggregateCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateCompliancePackResponse self = new CreateAggregateCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public CreateAggregateCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAggregateCompliancePackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAggregateCompliancePackResponse setBody(CreateAggregateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggregateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
