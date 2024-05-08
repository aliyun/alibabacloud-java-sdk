// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsCommonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TtsCommonResponseBody body;

    public static TtsCommonResponse build(java.util.Map<String, ?> map) throws Exception {
        TtsCommonResponse self = new TtsCommonResponse();
        return TeaModel.build(map, self);
    }

    public TtsCommonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TtsCommonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TtsCommonResponse setBody(TtsCommonResponseBody body) {
        this.body = body;
        return this;
    }
    public TtsCommonResponseBody getBody() {
        return this.body;
    }

}
