// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateResourceComplianceGroupByRegionResponseBody body;

    public static GetAggregateResourceComplianceGroupByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceGroupByRegionResponse self = new GetAggregateResourceComplianceGroupByRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceGroupByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceComplianceGroupByRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceComplianceGroupByRegionResponse setBody(GetAggregateResourceComplianceGroupByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceComplianceGroupByRegionResponseBody getBody() {
        return this.body;
    }

}
