// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RenameFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameFunctionResponseBody body;

    public static RenameFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameFunctionResponse self = new RenameFunctionResponse();
        return TeaModel.build(map, self);
    }

    public RenameFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameFunctionResponse setBody(RenameFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameFunctionResponseBody getBody() {
        return this.body;
    }

}
