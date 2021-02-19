// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DeactivateScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeactivateScalingConfigurationResponseBody body;

    public static DeactivateScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateScalingConfigurationResponse self = new DeactivateScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateScalingConfigurationResponse setBody(DeactivateScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
