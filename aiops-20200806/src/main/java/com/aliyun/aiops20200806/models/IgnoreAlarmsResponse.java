// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class IgnoreAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IgnoreAlarmsResponseBody body;

    public static IgnoreAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreAlarmsResponse self = new IgnoreAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreAlarmsResponse setBody(IgnoreAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreAlarmsResponseBody getBody() {
        return this.body;
    }

}
