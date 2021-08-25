// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateCompliancePackResponseBody body;

    public static GetAggregateCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackResponse self = new GetAggregateCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateCompliancePackResponse setBody(GetAggregateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
