// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceControlConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceControlConfigurationResponseBody body;

    public static GetInstanceControlConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceControlConfigurationResponse self = new GetInstanceControlConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceControlConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceControlConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceControlConfigurationResponse setBody(GetInstanceControlConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceControlConfigurationResponseBody getBody() {
        return this.body;
    }

}
