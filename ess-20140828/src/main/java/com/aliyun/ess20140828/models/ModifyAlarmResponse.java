// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAlarmResponseBody body;

    public static ModifyAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlarmResponse self = new ModifyAlarmResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAlarmResponse setBody(ModifyAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAlarmResponseBody getBody() {
        return this.body;
    }

}
