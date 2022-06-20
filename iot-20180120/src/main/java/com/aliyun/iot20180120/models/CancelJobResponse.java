// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelJobResponseBody body;

    public static CancelJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelJobResponse self = new CancelJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelJobResponse setBody(CancelJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelJobResponseBody getBody() {
        return this.body;
    }

}
