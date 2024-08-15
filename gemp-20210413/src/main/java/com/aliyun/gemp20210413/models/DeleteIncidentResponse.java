// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIncidentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIncidentResponseBody body;

    public static DeleteIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIncidentResponse self = new DeleteIncidentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIncidentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIncidentResponse setBody(DeleteIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIncidentResponseBody getBody() {
        return this.body;
    }

}
