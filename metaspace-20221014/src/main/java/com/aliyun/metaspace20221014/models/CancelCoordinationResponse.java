// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class CancelCoordinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCoordinationResponseBody body;

    public static CancelCoordinationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCoordinationResponse self = new CancelCoordinationResponse();
        return TeaModel.build(map, self);
    }

    public CancelCoordinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCoordinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCoordinationResponse setBody(CancelCoordinationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCoordinationResponseBody getBody() {
        return this.body;
    }

}
