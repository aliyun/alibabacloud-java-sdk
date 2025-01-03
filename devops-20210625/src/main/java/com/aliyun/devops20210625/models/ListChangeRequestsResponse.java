// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListChangeRequestsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChangeRequestsResponseBody body;

    public static ListChangeRequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRequestsResponse self = new ListChangeRequestsResponse();
        return TeaModel.build(map, self);
    }

    public ListChangeRequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangeRequestsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChangeRequestsResponse setBody(ListChangeRequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChangeRequestsResponseBody getBody() {
        return this.body;
    }

}
