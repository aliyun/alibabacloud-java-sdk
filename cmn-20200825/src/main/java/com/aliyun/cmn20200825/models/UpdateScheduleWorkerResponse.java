// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleWorkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScheduleWorkerResponseBody body;

    public static UpdateScheduleWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleWorkerResponse self = new UpdateScheduleWorkerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduleWorkerResponse setBody(UpdateScheduleWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduleWorkerResponseBody getBody() {
        return this.body;
    }

}
