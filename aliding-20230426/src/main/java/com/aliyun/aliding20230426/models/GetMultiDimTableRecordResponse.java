// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiDimTableRecordResponseBody body;

    public static GetMultiDimTableRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableRecordResponse self = new GetMultiDimTableRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiDimTableRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiDimTableRecordResponse setBody(GetMultiDimTableRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiDimTableRecordResponseBody getBody() {
        return this.body;
    }

}
