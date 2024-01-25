// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListBenchmarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBenchmarkTaskResponseBody body;

    public static ListBenchmarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBenchmarkTaskResponse self = new ListBenchmarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListBenchmarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBenchmarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBenchmarkTaskResponse setBody(ListBenchmarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

}
