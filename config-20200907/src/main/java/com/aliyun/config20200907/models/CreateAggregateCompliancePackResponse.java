// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateAggregateCompliancePackResponse setBody(CreateAggregateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggregateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
