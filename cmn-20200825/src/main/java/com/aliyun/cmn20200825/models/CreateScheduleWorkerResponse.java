// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleWorkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScheduleWorkerResponseBody body;

    public static CreateScheduleWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleWorkerResponse self = new CreateScheduleWorkerResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleWorkerResponse setBody(CreateScheduleWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleWorkerResponseBody getBody() {
        return this.body;
    }

}
