// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyScheduleMethodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScheduleMethodResponseBody body;

    public static ModifyScheduleMethodResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduleMethodResponse self = new ModifyScheduleMethodResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScheduleMethodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScheduleMethodResponse setBody(ModifyScheduleMethodResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScheduleMethodResponseBody getBody() {
        return this.body;
    }

}
