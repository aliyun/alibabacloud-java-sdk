// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartApsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartApsJobResponseBody body;

    public static StartApsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartApsJobResponse self = new StartApsJobResponse();
        return TeaModel.build(map, self);
    }

    public StartApsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartApsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartApsJobResponse setBody(StartApsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartApsJobResponseBody getBody() {
        return this.body;
    }

}
