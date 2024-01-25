// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CheckLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckLogResponseBody body;

    public static CheckLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLogResponse self = new CheckLogResponse();
        return TeaModel.build(map, self);
    }

    public CheckLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckLogResponse setBody(CheckLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLogResponseBody getBody() {
        return this.body;
    }

}
