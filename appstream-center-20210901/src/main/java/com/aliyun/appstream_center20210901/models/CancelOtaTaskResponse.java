// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CancelOtaTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelOtaTaskResponseBody body;

    public static CancelOtaTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOtaTaskResponse self = new CancelOtaTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelOtaTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOtaTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOtaTaskResponse setBody(CancelOtaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOtaTaskResponseBody getBody() {
        return this.body;
    }

}
