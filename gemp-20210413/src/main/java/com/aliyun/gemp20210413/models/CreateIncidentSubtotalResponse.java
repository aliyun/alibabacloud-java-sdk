// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentSubtotalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateIncidentSubtotalResponse setBody(CreateIncidentSubtotalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIncidentSubtotalResponseBody getBody() {
        return this.body;
    }

}
