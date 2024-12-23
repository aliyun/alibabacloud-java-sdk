// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class RetryMmsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryMmsJobResponseBody body;

    public static RetryMmsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryMmsJobResponse self = new RetryMmsJobResponse();
        return TeaModel.build(map, self);
    }

    public RetryMmsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryMmsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryMmsJobResponse setBody(RetryMmsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryMmsJobResponseBody getBody() {
        return this.body;
    }

}
