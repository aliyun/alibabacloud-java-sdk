// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListInstanceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceTaskResponseBody body;

    public static ListInstanceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTaskResponse self = new ListInstanceTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceTaskResponse setBody(ListInstanceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceTaskResponseBody getBody() {
        return this.body;
    }

}
