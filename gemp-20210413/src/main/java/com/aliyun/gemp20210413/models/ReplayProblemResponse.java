// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ReplayProblemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplayProblemResponseBody body;

    public static ReplayProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplayProblemResponse self = new ReplayProblemResponse();
        return TeaModel.build(map, self);
    }

    public ReplayProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplayProblemResponse setBody(ReplayProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplayProblemResponseBody getBody() {
        return this.body;
    }

}
