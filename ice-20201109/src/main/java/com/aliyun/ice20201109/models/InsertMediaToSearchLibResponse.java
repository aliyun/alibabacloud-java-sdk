// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class InsertMediaToSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertMediaToSearchLibResponseBody body;

    public static InsertMediaToSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertMediaToSearchLibResponse self = new InsertMediaToSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public InsertMediaToSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertMediaToSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertMediaToSearchLibResponse setBody(InsertMediaToSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertMediaToSearchLibResponseBody getBody() {
        return this.body;
    }

}
