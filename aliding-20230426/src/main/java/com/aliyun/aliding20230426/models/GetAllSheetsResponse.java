// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAllSheetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAllSheetsResponseBody body;

    public static GetAllSheetsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllSheetsResponse self = new GetAllSheetsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllSheetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllSheetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllSheetsResponse setBody(GetAllSheetsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllSheetsResponseBody getBody() {
        return this.body;
    }

}
