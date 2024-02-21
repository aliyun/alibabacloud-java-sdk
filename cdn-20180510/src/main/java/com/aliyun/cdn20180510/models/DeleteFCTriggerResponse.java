// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFCTriggerResponseBody body;

    public static DeleteFCTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFCTriggerResponse self = new DeleteFCTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFCTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFCTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFCTriggerResponse setBody(DeleteFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFCTriggerResponseBody getBody() {
        return this.body;
    }

}
