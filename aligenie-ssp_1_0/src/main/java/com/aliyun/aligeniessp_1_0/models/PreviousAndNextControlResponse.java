// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PreviousAndNextControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviousAndNextControlResponseBody body;

    public static PreviousAndNextControlResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviousAndNextControlResponse self = new PreviousAndNextControlResponse();
        return TeaModel.build(map, self);
    }

    public PreviousAndNextControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviousAndNextControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviousAndNextControlResponse setBody(PreviousAndNextControlResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviousAndNextControlResponseBody getBody() {
        return this.body;
    }

}
