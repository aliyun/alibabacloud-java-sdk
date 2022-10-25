// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetOrganizationSecurityCenterStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrganizationSecurityCenterStatusResponseBody body;

    public static GetOrganizationSecurityCenterStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationSecurityCenterStatusResponse self = new GetOrganizationSecurityCenterStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOrganizationSecurityCenterStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrganizationSecurityCenterStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrganizationSecurityCenterStatusResponse setBody(GetOrganizationSecurityCenterStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrganizationSecurityCenterStatusResponseBody getBody() {
        return this.body;
    }

}
