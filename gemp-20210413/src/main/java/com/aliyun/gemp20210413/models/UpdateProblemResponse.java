// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProblemResponseBody body;

    public static UpdateProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemResponse self = new UpdateProblemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProblemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProblemResponse setBody(UpdateProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemResponseBody getBody() {
        return this.body;
    }

}
