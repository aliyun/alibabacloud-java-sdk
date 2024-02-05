// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ClearDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearDataResponseBody body;

    public static ClearDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearDataResponse self = new ClearDataResponse();
        return TeaModel.build(map, self);
    }

    public ClearDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearDataResponse setBody(ClearDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearDataResponseBody getBody() {
        return this.body;
    }

}
