// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcAdminLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcAdminLicenseResponseBody body;

    public static GetOcIcAdminLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcAdminLicenseResponse self = new GetOcIcAdminLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcAdminLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcAdminLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcAdminLicenseResponse setBody(GetOcIcAdminLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcAdminLicenseResponseBody getBody() {
        return this.body;
    }

}
