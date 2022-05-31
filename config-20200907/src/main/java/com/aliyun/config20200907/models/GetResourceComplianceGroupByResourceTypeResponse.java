// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceGroupByResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceComplianceGroupByResourceTypeResponseBody body;

    public static GetResourceComplianceGroupByResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceGroupByResourceTypeResponse self = new GetResourceComplianceGroupByResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceGroupByResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceComplianceGroupByResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceComplianceGroupByResourceTypeResponse setBody(GetResourceComplianceGroupByResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceComplianceGroupByResourceTypeResponseBody getBody() {
        return this.body;
    }

}
