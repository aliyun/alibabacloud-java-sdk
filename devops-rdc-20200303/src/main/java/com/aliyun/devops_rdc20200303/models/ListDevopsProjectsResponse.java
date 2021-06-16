// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevopsProjectsResponseBody body;

    public static ListDevopsProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectsResponse self = new ListDevopsProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevopsProjectsResponse setBody(ListDevopsProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevopsProjectsResponseBody getBody() {
        return this.body;
    }

}
