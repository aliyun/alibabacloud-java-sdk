// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScheduleResponseBody body;

    public static DeleteScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleResponse self = new DeleteScheduleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScheduleResponse setBody(DeleteScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduleResponseBody getBody() {
        return this.body;
    }

}
