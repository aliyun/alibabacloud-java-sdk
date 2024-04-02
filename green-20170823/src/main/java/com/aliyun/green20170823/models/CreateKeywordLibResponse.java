// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateKeywordLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKeywordLibResponseBody body;

    public static CreateKeywordLibResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeywordLibResponse self = new CreateKeywordLibResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeywordLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKeywordLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKeywordLibResponse setBody(CreateKeywordLibResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKeywordLibResponseBody getBody() {
        return this.body;
    }

}
