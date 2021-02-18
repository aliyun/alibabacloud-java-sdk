// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigureSynchronizationJobResponseBody body;

    public static ConfigureSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobResponse self = new ConfigureSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSynchronizationJobResponse setBody(ConfigureSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
