// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIncidentResponseBody body;

    public static CreateIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIncidentResponse self = new CreateIncidentResponse();
        return TeaModel.build(map, self);
    }

    public CreateIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIncidentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIncidentResponse setBody(CreateIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIncidentResponseBody getBody() {
        return this.body;
    }

}
