// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanBaselineByTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScanBaselineByTaskResponseBody body;

    public static ListScanBaselineByTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScanBaselineByTaskResponse self = new ListScanBaselineByTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListScanBaselineByTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScanBaselineByTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScanBaselineByTaskResponse setBody(ListScanBaselineByTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScanBaselineByTaskResponseBody getBody() {
        return this.body;
    }

}
