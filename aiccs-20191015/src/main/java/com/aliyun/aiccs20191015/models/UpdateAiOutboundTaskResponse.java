// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAiOutboundTaskResponseBody body;

    public static UpdateAiOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiOutboundTaskResponse self = new UpdateAiOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiOutboundTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiOutboundTaskResponse setBody(UpdateAiOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
