// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumNodeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEthereumNodeConfigurationResponseBody body;

    public static UpdateEthereumNodeConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumNodeConfigurationResponse self = new UpdateEthereumNodeConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumNodeConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEthereumNodeConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEthereumNodeConfigurationResponse setBody(UpdateEthereumNodeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEthereumNodeConfigurationResponseBody getBody() {
        return this.body;
    }

}
