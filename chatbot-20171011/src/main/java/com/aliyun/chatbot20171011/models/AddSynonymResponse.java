// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AddSynonymResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSynonymResponseBody body;

    public static AddSynonymResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSynonymResponse self = new AddSynonymResponse();
        return TeaModel.build(map, self);
    }

    public AddSynonymResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSynonymResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSynonymResponse setBody(AddSynonymResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSynonymResponseBody getBody() {
        return this.body;
    }

}
