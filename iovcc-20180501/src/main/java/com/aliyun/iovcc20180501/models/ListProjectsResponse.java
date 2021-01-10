// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectsResponseBody body;

    public static ListProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponse self = new ListProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectsResponse setBody(ListProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectsResponseBody getBody() {
        return this.body;
    }

}
