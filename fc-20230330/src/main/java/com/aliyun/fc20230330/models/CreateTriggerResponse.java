// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Trigger body;

    public static CreateTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerResponse self = new CreateTriggerResponse();
        return TeaModel.build(map, self);
    }

    public CreateTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTriggerResponse setBody(Trigger body) {
        this.body = body;
        return this;
    }
    public Trigger getBody() {
        return this.body;
    }

}
