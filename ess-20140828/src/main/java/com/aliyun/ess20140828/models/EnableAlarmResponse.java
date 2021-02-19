// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class EnableAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAlarmResponseBody body;

    public static EnableAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAlarmResponse self = new EnableAlarmResponse();
        return TeaModel.build(map, self);
    }

    public EnableAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAlarmResponse setBody(EnableAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAlarmResponseBody getBody() {
        return this.body;
    }

}
