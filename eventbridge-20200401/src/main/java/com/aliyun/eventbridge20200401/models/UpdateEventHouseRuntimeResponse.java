// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventHouseRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventHouseRuntimeResponseBody body;

    public static UpdateEventHouseRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventHouseRuntimeResponse self = new UpdateEventHouseRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventHouseRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventHouseRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventHouseRuntimeResponse setBody(UpdateEventHouseRuntimeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventHouseRuntimeResponseBody getBody() {
        return this.body;
    }

}
