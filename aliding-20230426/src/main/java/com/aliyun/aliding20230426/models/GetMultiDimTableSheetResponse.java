// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableSheetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiDimTableSheetResponseBody body;

    public static GetMultiDimTableSheetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableSheetResponse self = new GetMultiDimTableSheetResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableSheetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiDimTableSheetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiDimTableSheetResponse setBody(GetMultiDimTableSheetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiDimTableSheetResponseBody getBody() {
        return this.body;
    }

}
