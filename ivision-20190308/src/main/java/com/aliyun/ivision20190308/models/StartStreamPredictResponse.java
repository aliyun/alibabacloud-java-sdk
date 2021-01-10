// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class StartStreamPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartStreamPredictResponseBody body;

    public static StartStreamPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        StartStreamPredictResponse self = new StartStreamPredictResponse();
        return TeaModel.build(map, self);
    }

    public StartStreamPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartStreamPredictResponse setBody(StartStreamPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public StartStreamPredictResponseBody getBody() {
        return this.body;
    }

}
