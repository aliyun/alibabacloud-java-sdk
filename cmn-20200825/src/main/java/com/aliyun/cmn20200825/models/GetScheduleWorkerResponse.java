// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleWorkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public GetScheduleWorkerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduleWorkerResponse setBody(GetScheduleWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduleWorkerResponseBody getBody() {
        return this.body;
    }

}
