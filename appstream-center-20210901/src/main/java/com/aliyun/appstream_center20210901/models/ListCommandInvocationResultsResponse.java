// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListCommandInvocationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommandInvocationResultsResponseBody body;

    public static ListCommandInvocationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommandInvocationResultsResponse self = new ListCommandInvocationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommandInvocationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommandInvocationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommandInvocationResultsResponse setBody(ListCommandInvocationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommandInvocationResultsResponseBody getBody() {
        return this.body;
    }

}
