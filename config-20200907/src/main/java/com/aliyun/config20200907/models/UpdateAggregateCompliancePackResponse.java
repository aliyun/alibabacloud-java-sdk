// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAggregateCompliancePackResponseBody body;

    public static UpdateAggregateCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateCompliancePackResponse self = new UpdateAggregateCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggregateCompliancePackResponse setBody(UpdateAggregateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggregateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
