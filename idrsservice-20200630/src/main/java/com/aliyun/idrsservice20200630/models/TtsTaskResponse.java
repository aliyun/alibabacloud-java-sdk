// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TtsTaskResponseBody body;

    public static TtsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        TtsTaskResponse self = new TtsTaskResponse();
        return TeaModel.build(map, self);
    }

    public TtsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TtsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TtsTaskResponse setBody(TtsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public TtsTaskResponseBody getBody() {
        return this.body;
    }

}
