// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentSubtotalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIncidentSubtotalsResponseBody body;

    public static ListIncidentSubtotalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentSubtotalsResponse self = new ListIncidentSubtotalsResponse();
        return TeaModel.build(map, self);
    }

    public ListIncidentSubtotalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIncidentSubtotalsResponse setBody(ListIncidentSubtotalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentSubtotalsResponseBody getBody() {
        return this.body;
    }

}
