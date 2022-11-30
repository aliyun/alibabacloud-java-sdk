// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class RecordingEnableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecordingEnableResponseBody body;

    public static RecordingEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordingEnableResponse self = new RecordingEnableResponse();
        return TeaModel.build(map, self);
    }

    public RecordingEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordingEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordingEnableResponse setBody(RecordingEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordingEnableResponseBody getBody() {
        return this.body;
    }

}
