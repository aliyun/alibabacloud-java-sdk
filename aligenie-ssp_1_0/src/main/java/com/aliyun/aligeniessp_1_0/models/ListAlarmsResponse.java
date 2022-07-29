// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlarmsResponseBody body;

    public static ListAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmsResponse self = new ListAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlarmsResponse setBody(ListAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmsResponseBody getBody() {
        return this.body;
    }

}
