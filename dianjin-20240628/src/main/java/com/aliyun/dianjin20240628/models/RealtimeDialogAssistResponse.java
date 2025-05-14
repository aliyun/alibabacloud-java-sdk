// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealtimeDialogAssistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RealtimeDialogAssistResponseBody body;

    public static RealtimeDialogAssistResponse build(java.util.Map<String, ?> map) throws Exception {
        RealtimeDialogAssistResponse self = new RealtimeDialogAssistResponse();
        return TeaModel.build(map, self);
    }

    public RealtimeDialogAssistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RealtimeDialogAssistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RealtimeDialogAssistResponse setBody(RealtimeDialogAssistResponseBody body) {
        this.body = body;
        return this;
    }
    public RealtimeDialogAssistResponseBody getBody() {
        return this.body;
    }

}
