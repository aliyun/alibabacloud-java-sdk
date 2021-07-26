// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleWorkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScheduleWorkerResponseBody body;

    public static GetScheduleWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleWorkerResponse self = new GetScheduleWorkerResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduleWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduleWorkerResponse setBody(GetScheduleWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduleWorkerResponseBody getBody() {
        return this.body;
    }

}
