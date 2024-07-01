// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppAttemptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSparkAppAttemptsResponseBody body;

    public static ListSparkAppAttemptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppAttemptsResponse self = new ListSparkAppAttemptsResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkAppAttemptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkAppAttemptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSparkAppAttemptsResponse setBody(ListSparkAppAttemptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkAppAttemptsResponseBody getBody() {
        return this.body;
    }

}
