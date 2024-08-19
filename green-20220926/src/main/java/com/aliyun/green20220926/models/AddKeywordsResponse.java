// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddKeywordsResponseBody body;

    public static AddKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordsResponse self = new AddKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public AddKeywordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddKeywordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddKeywordsResponse setBody(AddKeywordsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddKeywordsResponseBody getBody() {
        return this.body;
    }

}
