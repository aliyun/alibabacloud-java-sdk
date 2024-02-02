// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPredictiveCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartPredictiveCallResponseBody body;

    public static StartPredictiveCallResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPredictiveCallResponse self = new StartPredictiveCallResponse();
        return TeaModel.build(map, self);
    }

    public StartPredictiveCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPredictiveCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPredictiveCallResponse setBody(StartPredictiveCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPredictiveCallResponseBody getBody() {
        return this.body;
    }

}
