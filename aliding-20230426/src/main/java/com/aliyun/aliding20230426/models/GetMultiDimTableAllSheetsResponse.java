// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllSheetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiDimTableAllSheetsResponseBody body;

    public static GetMultiDimTableAllSheetsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllSheetsResponse self = new GetMultiDimTableAllSheetsResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllSheetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiDimTableAllSheetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiDimTableAllSheetsResponse setBody(GetMultiDimTableAllSheetsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiDimTableAllSheetsResponseBody getBody() {
        return this.body;
    }

}
