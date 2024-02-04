// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBatchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBatchesResponseBody body;

    public static ListBatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchesResponse self = new ListBatchesResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBatchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBatchesResponse setBody(ListBatchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBatchesResponseBody getBody() {
        return this.body;
    }

}
