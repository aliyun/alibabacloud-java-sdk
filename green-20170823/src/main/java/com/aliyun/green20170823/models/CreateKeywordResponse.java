// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateKeywordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKeywordResponseBody body;

    public static CreateKeywordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeywordResponse self = new CreateKeywordResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeywordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKeywordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKeywordResponse setBody(CreateKeywordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKeywordResponseBody getBody() {
        return this.body;
    }

}
