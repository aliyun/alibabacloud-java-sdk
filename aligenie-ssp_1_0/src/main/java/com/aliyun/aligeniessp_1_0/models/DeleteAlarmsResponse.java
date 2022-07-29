// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeleteAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlarmsResponseBody body;

    public static DeleteAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmsResponse self = new DeleteAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlarmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlarmsResponse setBody(DeleteAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlarmsResponseBody getBody() {
        return this.body;
    }

}
