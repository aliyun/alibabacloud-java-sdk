// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPartitionNamesResponseBody body;

    public static ListPartitionNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionNamesResponse self = new ListPartitionNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListPartitionNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPartitionNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPartitionNamesResponse setBody(ListPartitionNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPartitionNamesResponseBody getBody() {
        return this.body;
    }

}
