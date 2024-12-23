// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class StopMmsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMmsJobResponseBody body;

    public static StopMmsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMmsJobResponse self = new StopMmsJobResponse();
        return TeaModel.build(map, self);
    }

    public StopMmsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMmsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMmsJobResponse setBody(StopMmsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMmsJobResponseBody getBody() {
        return this.body;
    }

}
