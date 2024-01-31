// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListCheckRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckRunsResponseBody body;

    public static ListCheckRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRunsResponse self = new ListCheckRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckRunsResponse setBody(ListCheckRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckRunsResponseBody getBody() {
        return this.body;
    }

}
