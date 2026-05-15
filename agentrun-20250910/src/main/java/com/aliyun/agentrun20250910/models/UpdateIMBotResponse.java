// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateIMBotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IMBotResult body;

    public static UpdateIMBotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIMBotResponse self = new UpdateIMBotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIMBotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIMBotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIMBotResponse setBody(IMBotResult body) {
        this.body = body;
        return this;
    }
    public IMBotResult getBody() {
        return this.body;
    }

}
