// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckMaxYearOfServerLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckMaxYearOfServerLockResponse setBody(CheckMaxYearOfServerLockResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMaxYearOfServerLockResponseBody getBody() {
        return this.body;
    }

}
