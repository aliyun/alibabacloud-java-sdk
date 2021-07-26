// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScheduleTypeResponseBody body;

    public static UpdateScheduleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleTypeResponse self = new UpdateScheduleTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduleTypeResponse setBody(UpdateScheduleTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduleTypeResponseBody getBody() {
        return this.body;
    }

}
