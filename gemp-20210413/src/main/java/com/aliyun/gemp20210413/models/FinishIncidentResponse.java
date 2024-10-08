// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishIncidentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishIncidentResponseBody body;

    public static FinishIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishIncidentResponse self = new FinishIncidentResponse();
        return TeaModel.build(map, self);
    }

    public FinishIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishIncidentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishIncidentResponse setBody(FinishIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishIncidentResponseBody getBody() {
        return this.body;
    }

}
