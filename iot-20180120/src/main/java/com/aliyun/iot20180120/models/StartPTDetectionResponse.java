// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartPTDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartPTDetectionResponseBody body;

    public static StartPTDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPTDetectionResponse self = new StartPTDetectionResponse();
        return TeaModel.build(map, self);
    }

    public StartPTDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPTDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPTDetectionResponse setBody(StartPTDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPTDetectionResponseBody getBody() {
        return this.body;
    }

}
