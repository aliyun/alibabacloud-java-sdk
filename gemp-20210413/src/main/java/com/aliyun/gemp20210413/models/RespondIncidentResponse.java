// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RespondIncidentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RespondIncidentResponseBody body;

    public static RespondIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        RespondIncidentResponse self = new RespondIncidentResponse();
        return TeaModel.build(map, self);
    }

    public RespondIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RespondIncidentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RespondIncidentResponse setBody(RespondIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public RespondIncidentResponseBody getBody() {
        return this.body;
    }

}
