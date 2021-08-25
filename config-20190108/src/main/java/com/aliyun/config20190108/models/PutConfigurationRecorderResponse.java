// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigurationRecorderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutConfigurationRecorderResponseBody body;

    public static PutConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        PutConfigurationRecorderResponse self = new PutConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public PutConfigurationRecorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutConfigurationRecorderResponse setBody(PutConfigurationRecorderResponseBody body) {
        this.body = body;
        return this;
    }
    public PutConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

}
