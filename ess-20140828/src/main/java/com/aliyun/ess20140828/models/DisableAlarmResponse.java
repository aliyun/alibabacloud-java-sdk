// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DisableAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableAlarmResponseBody body;

    public static DisableAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAlarmResponse self = new DisableAlarmResponse();
        return TeaModel.build(map, self);
    }

    public DisableAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAlarmResponse setBody(DisableAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAlarmResponseBody getBody() {
        return this.body;
    }

}
