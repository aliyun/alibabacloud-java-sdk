// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeCustomsPunishmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcNegativeCustomsPunishmentResponseBody body;

    public static GetOcNegativeCustomsPunishmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeCustomsPunishmentResponse self = new GetOcNegativeCustomsPunishmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeCustomsPunishmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcNegativeCustomsPunishmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcNegativeCustomsPunishmentResponse setBody(GetOcNegativeCustomsPunishmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcNegativeCustomsPunishmentResponseBody getBody() {
        return this.body;
    }

}
