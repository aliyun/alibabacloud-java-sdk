// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailEscalationPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIncidentDetailEscalationPlansResponseBody body;

    public static ListIncidentDetailEscalationPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailEscalationPlansResponse self = new ListIncidentDetailEscalationPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailEscalationPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIncidentDetailEscalationPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIncidentDetailEscalationPlansResponse setBody(ListIncidentDetailEscalationPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentDetailEscalationPlansResponseBody getBody() {
        return this.body;
    }

}
