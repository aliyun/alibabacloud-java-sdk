// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DeleteScalingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScalingConfigurationResponseBody body;

    public static DeleteScalingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingConfigurationResponse self = new DeleteScalingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScalingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScalingConfigurationResponse setBody(DeleteScalingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScalingConfigurationResponseBody getBody() {
        return this.body;
    }

}
