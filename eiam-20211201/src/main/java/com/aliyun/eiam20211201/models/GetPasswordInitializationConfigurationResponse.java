// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordInitializationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPasswordInitializationConfigurationResponseBody body;

    public static GetPasswordInitializationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordInitializationConfigurationResponse self = new GetPasswordInitializationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetPasswordInitializationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPasswordInitializationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPasswordInitializationConfigurationResponse setBody(GetPasswordInitializationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPasswordInitializationConfigurationResponseBody getBody() {
        return this.body;
    }

}
