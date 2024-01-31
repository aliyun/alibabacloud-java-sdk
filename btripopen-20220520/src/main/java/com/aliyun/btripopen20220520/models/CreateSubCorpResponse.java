// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CreateSubCorpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSubCorpResponseBody body;

    public static CreateSubCorpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCorpResponse self = new CreateSubCorpResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubCorpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubCorpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubCorpResponse setBody(CreateSubCorpResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubCorpResponseBody getBody() {
        return this.body;
    }

}
