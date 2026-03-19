// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEventRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventRecordsResponseBody body;

    public static ListEventRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventRecordsResponse self = new ListEventRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventRecordsResponse setBody(ListEventRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventRecordsResponseBody getBody() {
        return this.body;
    }

}
