// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddKeywordLibResponseBody body;

    public static AddKeywordLibResponse build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordLibResponse self = new AddKeywordLibResponse();
        return TeaModel.build(map, self);
    }

    public AddKeywordLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddKeywordLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddKeywordLibResponse setBody(AddKeywordLibResponseBody body) {
        this.body = body;
        return this;
    }
    public AddKeywordLibResponseBody getBody() {
        return this.body;
    }

}
