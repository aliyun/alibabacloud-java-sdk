// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailEscalationPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListIncidentDetailEscalationPlansResponse setBody(ListIncidentDetailEscalationPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentDetailEscalationPlansResponseBody getBody() {
        return this.body;
    }

}
