// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSprintsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSprintsResponseBody body;

    public static ListSprintsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSprintsResponse self = new ListSprintsResponse();
        return TeaModel.build(map, self);
    }

    public ListSprintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSprintsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSprintsResponse setBody(ListSprintsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSprintsResponseBody getBody() {
        return this.body;
    }

}
