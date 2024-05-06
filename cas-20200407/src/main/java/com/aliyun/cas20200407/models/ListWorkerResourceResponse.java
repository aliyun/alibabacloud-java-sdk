// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWorkerResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkerResourceResponseBody body;

    public static ListWorkerResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerResourceResponse self = new ListWorkerResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkerResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkerResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkerResourceResponse setBody(ListWorkerResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkerResourceResponseBody getBody() {
        return this.body;
    }

}
