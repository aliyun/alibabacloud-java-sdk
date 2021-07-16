// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeliverIncidentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeliverIncidentResponseBody body;

    public static DeliverIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeliverIncidentResponse self = new DeliverIncidentResponse();
        return TeaModel.build(map, self);
    }

    public DeliverIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeliverIncidentResponse setBody(DeliverIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeliverIncidentResponseBody getBody() {
        return this.body;
    }

}
