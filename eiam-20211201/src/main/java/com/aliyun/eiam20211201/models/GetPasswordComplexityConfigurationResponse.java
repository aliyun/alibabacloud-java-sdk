// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordComplexityConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPasswordComplexityConfigurationResponseBody body;

    public static GetPasswordComplexityConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordComplexityConfigurationResponse self = new GetPasswordComplexityConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetPasswordComplexityConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPasswordComplexityConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPasswordComplexityConfigurationResponse setBody(GetPasswordComplexityConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPasswordComplexityConfigurationResponseBody getBody() {
        return this.body;
    }

}
