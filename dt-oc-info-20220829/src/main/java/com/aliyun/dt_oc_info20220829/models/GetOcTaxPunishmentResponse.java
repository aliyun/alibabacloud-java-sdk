// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxPunishmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcTaxPunishmentResponseBody body;

    public static GetOcTaxPunishmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxPunishmentResponse self = new GetOcTaxPunishmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcTaxPunishmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcTaxPunishmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcTaxPunishmentResponse setBody(GetOcTaxPunishmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcTaxPunishmentResponseBody getBody() {
        return this.body;
    }

}
