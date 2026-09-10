// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetTerraformPricingMappingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTerraformPricingMappingsResponseBody body;

    public static GetTerraformPricingMappingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTerraformPricingMappingsResponse self = new GetTerraformPricingMappingsResponse();
        return TeaModel.build(map, self);
    }

    public GetTerraformPricingMappingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTerraformPricingMappingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTerraformPricingMappingsResponse setBody(GetTerraformPricingMappingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTerraformPricingMappingsResponseBody getBody() {
        return this.body;
    }

}
