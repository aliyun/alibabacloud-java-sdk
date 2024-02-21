// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DiagnoseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DiagnoseInstanceResponseBody body;

    public static DiagnoseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseInstanceResponse self = new DiagnoseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DiagnoseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiagnoseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiagnoseInstanceResponse setBody(DiagnoseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DiagnoseInstanceResponseBody getBody() {
        return this.body;
    }

}
