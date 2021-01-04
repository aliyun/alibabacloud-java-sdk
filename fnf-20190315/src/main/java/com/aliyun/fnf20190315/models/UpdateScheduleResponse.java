// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScheduleResponseBody body;

    public static UpdateScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleResponse self = new UpdateScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduleResponse setBody(UpdateScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduleResponseBody getBody() {
        return this.body;
    }

}
