// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StartEaiJupyterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartEaiJupyterResponseBody body;

    public static StartEaiJupyterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEaiJupyterResponse self = new StartEaiJupyterResponse();
        return TeaModel.build(map, self);
    }

    public StartEaiJupyterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartEaiJupyterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartEaiJupyterResponse setBody(StartEaiJupyterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartEaiJupyterResponseBody getBody() {
        return this.body;
    }

}
