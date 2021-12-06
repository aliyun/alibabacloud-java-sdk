// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListGroupsResponse setBody(ListGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupsResponseBody getBody() {
        return this.body;
    }

}
