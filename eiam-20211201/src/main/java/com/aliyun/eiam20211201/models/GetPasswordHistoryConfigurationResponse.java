// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordHistoryConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPasswordHistoryConfigurationResponseBody body;

    public static GetPasswordHistoryConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordHistoryConfigurationResponse self = new GetPasswordHistoryConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetPasswordHistoryConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPasswordHistoryConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPasswordHistoryConfigurationResponse setBody(GetPasswordHistoryConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPasswordHistoryConfigurationResponseBody getBody() {
        return this.body;
    }

}
