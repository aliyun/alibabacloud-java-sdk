// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupsResponseBody body;

    public static ListGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponse self = new ListGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupsResponse setBody(ListGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupsResponseBody getBody() {
        return this.body;
    }

}
