// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkitemTimeResponseBody body;

    public static ListWorkitemTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemTimeResponse self = new ListWorkitemTimeResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkitemTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkitemTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkitemTimeResponse setBody(ListWorkitemTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkitemTimeResponseBody getBody() {
        return this.body;
    }

}
