// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckMaxYearOfServerLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckMaxYearOfServerLockResponseBody body;

    public static CheckMaxYearOfServerLockResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMaxYearOfServerLockResponse self = new CheckMaxYearOfServerLockResponse();
        return TeaModel.build(map, self);
    }

    public CheckMaxYearOfServerLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMaxYearOfServerLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMaxYearOfServerLockResponse setBody(CheckMaxYearOfServerLockResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMaxYearOfServerLockResponseBody getBody() {
        return this.body;
    }

}
