// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByPackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateResourceComplianceByPackResponseBody body;

    public static GetAggregateResourceComplianceByPackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceByPackResponse self = new GetAggregateResourceComplianceByPackResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceByPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceComplianceByPackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceComplianceByPackResponse setBody(GetAggregateResourceComplianceByPackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceComplianceByPackResponseBody getBody() {
        return this.body;
    }

}
