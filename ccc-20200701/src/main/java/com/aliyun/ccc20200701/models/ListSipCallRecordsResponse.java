// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSipCallRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSipCallRecordsResponseBody body;

    public static ListSipCallRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSipCallRecordsResponse self = new ListSipCallRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListSipCallRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSipCallRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSipCallRecordsResponse setBody(ListSipCallRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSipCallRecordsResponseBody getBody() {
        return this.body;
    }

}
