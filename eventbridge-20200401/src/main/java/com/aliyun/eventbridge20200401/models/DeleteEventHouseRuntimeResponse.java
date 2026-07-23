// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventHouseRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventHouseRuntimeResponseBody body;

    public static DeleteEventHouseRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventHouseRuntimeResponse self = new DeleteEventHouseRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventHouseRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventHouseRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventHouseRuntimeResponse setBody(DeleteEventHouseRuntimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventHouseRuntimeResponseBody getBody() {
        return this.body;
    }

}
