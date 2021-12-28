// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceGroupByRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetResourceComplianceGroupByRegionResponse setBody(GetResourceComplianceGroupByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceComplianceGroupByRegionResponseBody getBody() {
        return this.body;
    }

}
