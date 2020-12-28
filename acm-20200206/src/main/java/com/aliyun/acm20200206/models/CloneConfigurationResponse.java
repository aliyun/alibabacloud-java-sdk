// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CloneConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneConfigurationResponseBody body;

    public static CloneConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneConfigurationResponse self = new CloneConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CloneConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneConfigurationResponse setBody(CloneConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneConfigurationResponseBody getBody() {
        return this.body;
    }

}
