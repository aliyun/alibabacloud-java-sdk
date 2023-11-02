// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateAutomateResponseConfigStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAutomateResponseConfigStatusResponseBody body;

    public static UpdateAutomateResponseConfigStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutomateResponseConfigStatusResponse self = new UpdateAutomateResponseConfigStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutomateResponseConfigStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutomateResponseConfigStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutomateResponseConfigStatusResponse setBody(UpdateAutomateResponseConfigStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutomateResponseConfigStatusResponseBody getBody() {
        return this.body;
    }

}
