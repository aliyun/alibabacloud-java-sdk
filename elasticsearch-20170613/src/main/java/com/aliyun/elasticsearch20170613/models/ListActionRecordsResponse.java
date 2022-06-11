// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListActionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListActionRecordsResponseBody body;

    public static ListActionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActionRecordsResponse self = new ListActionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListActionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActionRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActionRecordsResponse setBody(ListActionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActionRecordsResponseBody getBody() {
        return this.body;
    }

}
