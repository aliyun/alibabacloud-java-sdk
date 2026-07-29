// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServiceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceTaskResponseBody body;

    public static ListServiceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTaskResponse self = new ListServiceTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceTaskResponse setBody(ListServiceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceTaskResponseBody getBody() {
        return this.body;
    }

}
