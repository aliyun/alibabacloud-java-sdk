// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListRecursionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecursionRecordsResponseBody body;

    public static ListRecursionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecursionRecordsResponse self = new ListRecursionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecursionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecursionRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecursionRecordsResponse setBody(ListRecursionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecursionRecordsResponseBody getBody() {
        return this.body;
    }

}
