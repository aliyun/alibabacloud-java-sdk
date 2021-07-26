// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleWorkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScheduleWorkerResponseBody body;

    public static DeleteScheduleWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleWorkerResponse self = new DeleteScheduleWorkerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduleWorkerResponse setBody(DeleteScheduleWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduleWorkerResponseBody getBody() {
        return this.body;
    }

}
