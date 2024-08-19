// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordsToLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddKeywordsToLibResponseBody body;

    public static AddKeywordsToLibResponse build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordsToLibResponse self = new AddKeywordsToLibResponse();
        return TeaModel.build(map, self);
    }

    public AddKeywordsToLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddKeywordsToLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddKeywordsToLibResponse setBody(AddKeywordsToLibResponseBody body) {
        this.body = body;
        return this;
    }
    public AddKeywordsToLibResponseBody getBody() {
        return this.body;
    }

}
