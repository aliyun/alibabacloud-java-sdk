// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameTrialSurplusDurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameTrialSurplusDurationResponseBody body;

    public static GetGameTrialSurplusDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameTrialSurplusDurationResponse self = new GetGameTrialSurplusDurationResponse();
        return TeaModel.build(map, self);
    }

    public GetGameTrialSurplusDurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameTrialSurplusDurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGameTrialSurplusDurationResponse setBody(GetGameTrialSurplusDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameTrialSurplusDurationResponseBody getBody() {
        return this.body;
    }

}
