// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateXpackMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateXpackMonitorConfigResponseBody body;

    public static UpdateXpackMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateXpackMonitorConfigResponse self = new UpdateXpackMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateXpackMonitorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateXpackMonitorConfigResponse setBody(UpdateXpackMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateXpackMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
