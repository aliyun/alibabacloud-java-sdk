// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CancelAppointmentRestartInstanceNodeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAppointmentRestartInstanceNodeListResponseBody body;

    public static CancelAppointmentRestartInstanceNodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAppointmentRestartInstanceNodeListResponse self = new CancelAppointmentRestartInstanceNodeListResponse();
        return TeaModel.build(map, self);
    }

    public CancelAppointmentRestartInstanceNodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAppointmentRestartInstanceNodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAppointmentRestartInstanceNodeListResponse setBody(CancelAppointmentRestartInstanceNodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAppointmentRestartInstanceNodeListResponseBody getBody() {
        return this.body;
    }

}
