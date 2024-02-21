// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutonomousNotifyEventContentResponseBody body;

    public static GetAutonomousNotifyEventContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventContentResponse self = new GetAutonomousNotifyEventContentResponse();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutonomousNotifyEventContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutonomousNotifyEventContentResponse setBody(GetAutonomousNotifyEventContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutonomousNotifyEventContentResponseBody getBody() {
        return this.body;
    }

}
