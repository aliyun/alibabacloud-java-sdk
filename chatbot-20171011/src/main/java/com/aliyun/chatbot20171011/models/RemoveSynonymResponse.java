// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveSynonymResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSynonymResponseBody body;

    public static RemoveSynonymResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSynonymResponse self = new RemoveSynonymResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSynonymResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSynonymResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSynonymResponse setBody(RemoveSynonymResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSynonymResponseBody getBody() {
        return this.body;
    }

}
