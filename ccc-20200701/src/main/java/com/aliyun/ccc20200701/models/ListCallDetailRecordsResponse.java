// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallDetailRecordsResponseBody body;

    public static ListCallDetailRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsResponse self = new ListCallDetailRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallDetailRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallDetailRecordsResponse setBody(ListCallDetailRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallDetailRecordsResponseBody getBody() {
        return this.body;
    }

}
