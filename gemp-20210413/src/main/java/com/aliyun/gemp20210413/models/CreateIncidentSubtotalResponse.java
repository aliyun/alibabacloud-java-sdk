// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentSubtotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIncidentSubtotalResponseBody body;

    public static CreateIncidentSubtotalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIncidentSubtotalResponse self = new CreateIncidentSubtotalResponse();
        return TeaModel.build(map, self);
    }

    public CreateIncidentSubtotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIncidentSubtotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIncidentSubtotalResponse setBody(CreateIncidentSubtotalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIncidentSubtotalResponseBody getBody() {
        return this.body;
    }

}
