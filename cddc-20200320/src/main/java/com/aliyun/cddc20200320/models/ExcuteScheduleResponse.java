// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ExcuteScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExcuteScheduleResponseBody body;

    public static ExcuteScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExcuteScheduleResponse self = new ExcuteScheduleResponse();
        return TeaModel.build(map, self);
    }

    public ExcuteScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExcuteScheduleResponse setBody(ExcuteScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExcuteScheduleResponseBody getBody() {
        return this.body;
    }

}
