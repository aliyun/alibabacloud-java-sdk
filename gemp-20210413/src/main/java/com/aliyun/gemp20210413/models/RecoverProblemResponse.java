// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RecoverProblemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecoverProblemResponseBody body;

    public static RecoverProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverProblemResponse self = new RecoverProblemResponse();
        return TeaModel.build(map, self);
    }

    public RecoverProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverProblemResponse setBody(RecoverProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverProblemResponseBody getBody() {
        return this.body;
    }

}
