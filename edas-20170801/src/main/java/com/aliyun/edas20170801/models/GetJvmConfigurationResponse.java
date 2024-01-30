// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJvmConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJvmConfigurationResponseBody body;

    public static GetJvmConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJvmConfigurationResponse self = new GetJvmConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetJvmConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJvmConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJvmConfigurationResponse setBody(GetJvmConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJvmConfigurationResponseBody getBody() {
        return this.body;
    }

}
