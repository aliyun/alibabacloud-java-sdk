// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeEnvironmentPunishmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcNegativeEnvironmentPunishmentResponseBody body;

    public static GetOcNegativeEnvironmentPunishmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeEnvironmentPunishmentResponse self = new GetOcNegativeEnvironmentPunishmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeEnvironmentPunishmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcNegativeEnvironmentPunishmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcNegativeEnvironmentPunishmentResponse setBody(GetOcNegativeEnvironmentPunishmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcNegativeEnvironmentPunishmentResponseBody getBody() {
        return this.body;
    }

}
