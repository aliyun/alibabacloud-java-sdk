// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateContainerConfigurationResponseBody body;

    public static UpdateContainerConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerConfigurationResponse self = new UpdateContainerConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContainerConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContainerConfigurationResponse setBody(UpdateContainerConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContainerConfigurationResponseBody getBody() {
        return this.body;
    }

}
