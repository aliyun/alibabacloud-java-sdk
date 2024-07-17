// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CancelQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelQueryResponseBody body;

    public static CancelQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelQueryResponse self = new CancelQueryResponse();
        return TeaModel.build(map, self);
    }

    public CancelQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelQueryResponse setBody(CancelQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelQueryResponseBody getBody() {
        return this.body;
    }

}
