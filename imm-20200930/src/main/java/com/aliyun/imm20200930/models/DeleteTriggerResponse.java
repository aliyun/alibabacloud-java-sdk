// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTriggerResponseBody body;

    public static DeleteTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTriggerResponse self = new DeleteTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTriggerResponse setBody(DeleteTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTriggerResponseBody getBody() {
        return this.body;
    }

}
