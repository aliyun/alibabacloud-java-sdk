// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class StopStreamPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopStreamPredictResponseBody body;

    public static StopStreamPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        StopStreamPredictResponse self = new StopStreamPredictResponse();
        return TeaModel.build(map, self);
    }

    public StopStreamPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopStreamPredictResponse setBody(StopStreamPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStreamPredictResponseBody getBody() {
        return this.body;
    }

}
