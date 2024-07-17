// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsByFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPartitionsByFilterResponseBody body;

    public static ListPartitionsByFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsByFilterResponse self = new ListPartitionsByFilterResponse();
        return TeaModel.build(map, self);
    }

    public ListPartitionsByFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPartitionsByFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPartitionsByFilterResponse setBody(ListPartitionsByFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPartitionsByFilterResponseBody getBody() {
        return this.body;
    }

}
