// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ToggleFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ToggleFeaturesResponseBody body;

    public static ToggleFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ToggleFeaturesResponse self = new ToggleFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ToggleFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ToggleFeaturesResponse setBody(ToggleFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ToggleFeaturesResponseBody getBody() {
        return this.body;
    }

}
