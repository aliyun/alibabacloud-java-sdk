// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDetectProcessResponseBody body;

    public static UpdateDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectProcessResponse self = new UpdateDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDetectProcessResponse setBody(UpdateDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDetectProcessResponseBody getBody() {
        return this.body;
    }

}
