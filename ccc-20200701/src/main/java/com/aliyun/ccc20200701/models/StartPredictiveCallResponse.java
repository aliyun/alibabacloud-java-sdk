// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPredictiveCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StartPredictiveCallResponse setBody(StartPredictiveCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPredictiveCallResponseBody getBody() {
        return this.body;
    }

}
