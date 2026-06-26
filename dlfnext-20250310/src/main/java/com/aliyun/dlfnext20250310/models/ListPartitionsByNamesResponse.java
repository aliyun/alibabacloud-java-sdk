// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListPartitionsByNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPartitionsByNamesResponseBody body;

    public static ListPartitionsByNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsByNamesResponse self = new ListPartitionsByNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListPartitionsByNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPartitionsByNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPartitionsByNamesResponse setBody(ListPartitionsByNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPartitionsByNamesResponseBody getBody() {
        return this.body;
    }

}
