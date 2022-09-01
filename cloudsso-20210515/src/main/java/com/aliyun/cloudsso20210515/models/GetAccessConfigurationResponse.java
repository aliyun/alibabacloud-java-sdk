// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessConfigurationResponseBody body;

    public static GetAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessConfigurationResponse self = new GetAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessConfigurationResponse setBody(GetAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
