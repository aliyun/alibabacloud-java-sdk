// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealTimeDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RealTimeDialogResponseBody body;

    public static RealTimeDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        RealTimeDialogResponse self = new RealTimeDialogResponse();
        return TeaModel.build(map, self);
    }

    public RealTimeDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RealTimeDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RealTimeDialogResponse setBody(RealTimeDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public RealTimeDialogResponseBody getBody() {
        return this.body;
    }

}
