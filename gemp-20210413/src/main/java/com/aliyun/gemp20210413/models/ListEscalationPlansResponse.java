// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEscalationPlansResponseBody body;

    public static ListEscalationPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlansResponse self = new ListEscalationPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEscalationPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEscalationPlansResponse setBody(ListEscalationPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEscalationPlansResponseBody getBody() {
        return this.body;
    }

}
