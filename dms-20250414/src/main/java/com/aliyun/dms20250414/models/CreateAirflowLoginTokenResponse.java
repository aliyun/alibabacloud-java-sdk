// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAirflowLoginTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAirflowLoginTokenResponseBody body;

    public static CreateAirflowLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAirflowLoginTokenResponse self = new CreateAirflowLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateAirflowLoginTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAirflowLoginTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAirflowLoginTokenResponse setBody(CreateAirflowLoginTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAirflowLoginTokenResponseBody getBody() {
        return this.body;
    }

}
