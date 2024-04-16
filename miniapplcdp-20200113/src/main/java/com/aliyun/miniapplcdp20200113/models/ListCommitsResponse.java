// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListCommitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommitsResponseBody body;

    public static ListCommitsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommitsResponse self = new ListCommitsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommitsResponse setBody(ListCommitsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommitsResponseBody getBody() {
        return this.body;
    }

}
