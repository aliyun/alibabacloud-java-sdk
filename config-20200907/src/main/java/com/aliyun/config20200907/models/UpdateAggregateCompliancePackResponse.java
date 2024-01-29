// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateAggregateCompliancePackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAggregateCompliancePackResponse setBody(UpdateAggregateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggregateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
