// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateInlinePolicyForAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInlinePolicyForAccessConfigurationResponseBody body;

    public static UpdateInlinePolicyForAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInlinePolicyForAccessConfigurationResponse self = new UpdateInlinePolicyForAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInlinePolicyForAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInlinePolicyForAccessConfigurationResponse setBody(UpdateInlinePolicyForAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInlinePolicyForAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
