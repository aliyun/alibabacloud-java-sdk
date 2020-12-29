// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmMonitorStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGtmMonitorStatusResponseBody body;

    public static SetGtmMonitorStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGtmMonitorStatusResponse self = new SetGtmMonitorStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetGtmMonitorStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGtmMonitorStatusResponse setBody(SetGtmMonitorStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGtmMonitorStatusResponseBody getBody() {
        return this.body;
    }

}
