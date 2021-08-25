// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateAccountComplianceByPackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateAccountComplianceByPackResponseBody body;

    public static GetAggregateAccountComplianceByPackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateAccountComplianceByPackResponse self = new GetAggregateAccountComplianceByPackResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateAccountComplianceByPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateAccountComplianceByPackResponse setBody(GetAggregateAccountComplianceByPackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateAccountComplianceByPackResponseBody getBody() {
        return this.body;
    }

}
