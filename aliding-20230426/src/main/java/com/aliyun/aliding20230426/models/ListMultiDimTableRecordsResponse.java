// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMultiDimTableRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultiDimTableRecordsResponseBody body;

    public static ListMultiDimTableRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiDimTableRecordsResponse self = new ListMultiDimTableRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiDimTableRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiDimTableRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiDimTableRecordsResponse setBody(ListMultiDimTableRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiDimTableRecordsResponseBody getBody() {
        return this.body;
    }

}
