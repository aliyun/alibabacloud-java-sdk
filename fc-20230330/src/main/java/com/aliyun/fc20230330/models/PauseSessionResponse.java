// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PauseSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Session body;

    public static PauseSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseSessionResponse self = new PauseSessionResponse();
        return TeaModel.build(map, self);
    }

    public PauseSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseSessionResponse setBody(Session body) {
        this.body = body;
        return this;
    }
    public Session getBody() {
        return this.body;
    }

}
