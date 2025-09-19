// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Session body;

    public static GetSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionResponse self = new GetSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSessionResponse setBody(Session body) {
        this.body = body;
        return this;
    }
    public Session getBody() {
        return this.body;
    }

}
