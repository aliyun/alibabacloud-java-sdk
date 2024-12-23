// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class StartMmsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartMmsJobResponseBody body;

    public static StartMmsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMmsJobResponse self = new StartMmsJobResponse();
        return TeaModel.build(map, self);
    }

    public StartMmsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMmsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartMmsJobResponse setBody(StartMmsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMmsJobResponseBody getBody() {
        return this.body;
    }

}
