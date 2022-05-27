// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddFCTriggerResponseBody body;

    public static AddFCTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFCTriggerResponse self = new AddFCTriggerResponse();
        return TeaModel.build(map, self);
    }

    public AddFCTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFCTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFCTriggerResponse setBody(AddFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFCTriggerResponseBody getBody() {
        return this.body;
    }

}
