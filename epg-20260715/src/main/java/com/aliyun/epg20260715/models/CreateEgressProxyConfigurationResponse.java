// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEgressProxyConfigurationResponseBody body;

    public static CreateEgressProxyConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyConfigurationResponse self = new CreateEgressProxyConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEgressProxyConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEgressProxyConfigurationResponse setBody(CreateEgressProxyConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEgressProxyConfigurationResponseBody getBody() {
        return this.body;
    }

}
