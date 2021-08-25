// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartConfigurationRecorderResponseBody body;

    public static StartConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        StartConfigurationRecorderResponse self = new StartConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public StartConfigurationRecorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartConfigurationRecorderResponse setBody(StartConfigurationRecorderResponseBody body) {
        this.body = body;
        return this;
    }
    public StartConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

}
