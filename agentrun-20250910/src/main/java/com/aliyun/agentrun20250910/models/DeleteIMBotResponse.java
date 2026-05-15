// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteIMBotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIMBotNoContent body;

    public static DeleteIMBotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIMBotResponse self = new DeleteIMBotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIMBotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIMBotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIMBotResponse setBody(DeleteIMBotNoContent body) {
        this.body = body;
        return this;
    }
    public DeleteIMBotNoContent getBody() {
        return this.body;
    }

}
