// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ScheduleKeyDeletionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScheduleKeyDeletionResponseBody body;

    public static ScheduleKeyDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        ScheduleKeyDeletionResponse self = new ScheduleKeyDeletionResponse();
        return TeaModel.build(map, self);
    }

    public ScheduleKeyDeletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScheduleKeyDeletionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScheduleKeyDeletionResponse setBody(ScheduleKeyDeletionResponseBody body) {
        this.body = body;
        return this;
    }
    public ScheduleKeyDeletionResponseBody getBody() {
        return this.body;
    }

}
