// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageTablesInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStorageTablesInfoResponseBody body;

    public static ListStorageTablesInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStorageTablesInfoResponse self = new ListStorageTablesInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListStorageTablesInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStorageTablesInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStorageTablesInfoResponse setBody(ListStorageTablesInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStorageTablesInfoResponseBody getBody() {
        return this.body;
    }

}
