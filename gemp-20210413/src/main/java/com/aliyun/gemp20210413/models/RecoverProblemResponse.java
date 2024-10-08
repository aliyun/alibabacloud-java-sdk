// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RecoverProblemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RecoverProblemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverProblemResponse setBody(RecoverProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverProblemResponseBody getBody() {
        return this.body;
    }

}
