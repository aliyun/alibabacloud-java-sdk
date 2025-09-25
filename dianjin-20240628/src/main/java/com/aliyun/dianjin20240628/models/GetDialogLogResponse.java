// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDialogLogResponseBody body;

    public static GetDialogLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDialogLogResponse self = new GetDialogLogResponse();
        return TeaModel.build(map, self);
    }

    public GetDialogLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDialogLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDialogLogResponse setBody(GetDialogLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDialogLogResponseBody getBody() {
        return this.body;
    }

}
