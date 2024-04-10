// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagScanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepoTagScanResultResponseBody body;

    public static ListRepoTagScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagScanResultResponse self = new ListRepoTagScanResultResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoTagScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoTagScanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoTagScanResultResponse setBody(ListRepoTagScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoTagScanResultResponseBody getBody() {
        return this.body;
    }

}
