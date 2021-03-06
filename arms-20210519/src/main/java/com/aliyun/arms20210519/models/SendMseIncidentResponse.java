// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SendMseIncidentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendMseIncidentResponseBody body;

    public static SendMseIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMseIncidentResponse self = new SendMseIncidentResponse();
        return TeaModel.build(map, self);
    }

    public SendMseIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMseIncidentResponse setBody(SendMseIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMseIncidentResponseBody getBody() {
        return this.body;
    }

}
