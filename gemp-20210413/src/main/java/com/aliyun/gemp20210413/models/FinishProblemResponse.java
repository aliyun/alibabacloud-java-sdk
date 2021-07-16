// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishProblemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishProblemResponseBody body;

    public static FinishProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishProblemResponse self = new FinishProblemResponse();
        return TeaModel.build(map, self);
    }

    public FinishProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishProblemResponse setBody(FinishProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishProblemResponseBody getBody() {
        return this.body;
    }

}
