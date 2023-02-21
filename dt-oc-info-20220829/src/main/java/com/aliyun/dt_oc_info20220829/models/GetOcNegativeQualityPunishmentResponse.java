// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeQualityPunishmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcNegativeQualityPunishmentResponseBody body;

    public static GetOcNegativeQualityPunishmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeQualityPunishmentResponse self = new GetOcNegativeQualityPunishmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeQualityPunishmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcNegativeQualityPunishmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcNegativeQualityPunishmentResponse setBody(GetOcNegativeQualityPunishmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcNegativeQualityPunishmentResponseBody getBody() {
        return this.body;
    }

}
