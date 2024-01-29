// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateResourceComplianceGroupByResourceTypeResponseBody body;

    public static GetAggregateResourceComplianceGroupByResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceGroupByResourceTypeResponse self = new GetAggregateResourceComplianceGroupByResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponse setBody(GetAggregateResourceComplianceGroupByResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceComplianceGroupByResourceTypeResponseBody getBody() {
        return this.body;
    }

}
