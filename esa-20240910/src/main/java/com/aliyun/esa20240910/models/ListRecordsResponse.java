// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecordsResponseBody body;

    public static ListRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordsResponse self = new ListRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecordsResponse setBody(ListRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordsResponseBody getBody() {
        return this.body;
    }

}
