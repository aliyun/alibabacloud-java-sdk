// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class EndToEndRealTimeDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndToEndRealTimeDialogResponseBody body;

    public static EndToEndRealTimeDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        EndToEndRealTimeDialogResponse self = new EndToEndRealTimeDialogResponse();
        return TeaModel.build(map, self);
    }

    public EndToEndRealTimeDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndToEndRealTimeDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndToEndRealTimeDialogResponse setBody(EndToEndRealTimeDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public EndToEndRealTimeDialogResponseBody getBody() {
        return this.body;
    }

}
