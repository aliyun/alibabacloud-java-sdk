// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIncidentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteIncidentResponse setBody(DeleteIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIncidentResponseBody getBody() {
        return this.body;
    }

}
