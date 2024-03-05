// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInvocationResultsResponseBody body;

    public static ListInvocationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationResultsResponse self = new ListInvocationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListInvocationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInvocationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInvocationResultsResponse setBody(ListInvocationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInvocationResultsResponseBody getBody() {
        return this.body;
    }

}
