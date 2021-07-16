// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateIncidentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIncidentResponseBody body;

    public static UpdateIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIncidentResponse self = new UpdateIncidentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIncidentResponse setBody(UpdateIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIncidentResponseBody getBody() {
        return this.body;
    }

}
