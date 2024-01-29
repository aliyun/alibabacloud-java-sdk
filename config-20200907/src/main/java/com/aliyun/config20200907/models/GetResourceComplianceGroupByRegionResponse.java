// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceGroupByRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceComplianceGroupByRegionResponseBody body;

    public static GetResourceComplianceGroupByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceGroupByRegionResponse self = new GetResourceComplianceGroupByRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceGroupByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceComplianceGroupByRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceComplianceGroupByRegionResponse setBody(GetResourceComplianceGroupByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceComplianceGroupByRegionResponseBody getBody() {
        return this.body;
    }

}
