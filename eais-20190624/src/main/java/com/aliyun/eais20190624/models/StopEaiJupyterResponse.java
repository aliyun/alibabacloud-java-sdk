// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StopEaiJupyterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopEaiJupyterResponseBody body;

    public static StopEaiJupyterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopEaiJupyterResponse self = new StopEaiJupyterResponse();
        return TeaModel.build(map, self);
    }

    public StopEaiJupyterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopEaiJupyterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopEaiJupyterResponse setBody(StopEaiJupyterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopEaiJupyterResponseBody getBody() {
        return this.body;
    }

}
