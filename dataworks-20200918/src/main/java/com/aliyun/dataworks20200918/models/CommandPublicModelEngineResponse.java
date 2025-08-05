// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CommandPublicModelEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommandPublicModelEngineResponseBody body;

    public static CommandPublicModelEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        CommandPublicModelEngineResponse self = new CommandPublicModelEngineResponse();
        return TeaModel.build(map, self);
    }

    public CommandPublicModelEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommandPublicModelEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommandPublicModelEngineResponse setBody(CommandPublicModelEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public CommandPublicModelEngineResponseBody getBody() {
        return this.body;
    }

}
