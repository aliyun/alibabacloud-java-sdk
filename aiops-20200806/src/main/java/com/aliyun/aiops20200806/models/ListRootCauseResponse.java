// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListRootCauseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRootCauseResponseBody body;

    public static ListRootCauseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRootCauseResponse self = new ListRootCauseResponse();
        return TeaModel.build(map, self);
    }

    public ListRootCauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRootCauseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRootCauseResponse setBody(ListRootCauseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRootCauseResponseBody getBody() {
        return this.body;
    }

}
