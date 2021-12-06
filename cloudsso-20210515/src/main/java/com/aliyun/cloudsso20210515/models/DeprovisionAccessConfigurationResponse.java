// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeprovisionAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeprovisionAccessConfigurationResponseBody body;

    public static DeprovisionAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionAccessConfigurationResponse self = new DeprovisionAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeprovisionAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeprovisionAccessConfigurationResponse setBody(DeprovisionAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeprovisionAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
