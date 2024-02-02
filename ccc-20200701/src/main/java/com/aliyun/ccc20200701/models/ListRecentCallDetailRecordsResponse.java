// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecentCallDetailRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecentCallDetailRecordsResponseBody body;

    public static ListRecentCallDetailRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentCallDetailRecordsResponse self = new ListRecentCallDetailRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentCallDetailRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentCallDetailRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecentCallDetailRecordsResponse setBody(ListRecentCallDetailRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentCallDetailRecordsResponseBody getBody() {
        return this.body;
    }

}
