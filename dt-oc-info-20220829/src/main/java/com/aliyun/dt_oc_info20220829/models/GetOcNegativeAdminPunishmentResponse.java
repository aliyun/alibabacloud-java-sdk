// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeAdminPunishmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcNegativeAdminPunishmentResponseBody body;

    public static GetOcNegativeAdminPunishmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeAdminPunishmentResponse self = new GetOcNegativeAdminPunishmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeAdminPunishmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcNegativeAdminPunishmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcNegativeAdminPunishmentResponse setBody(GetOcNegativeAdminPunishmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcNegativeAdminPunishmentResponseBody getBody() {
        return this.body;
    }

}
