// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevopsProjectTasksResponseBody body;

    public static ListDevopsProjectTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTasksResponse self = new ListDevopsProjectTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevopsProjectTasksResponse setBody(ListDevopsProjectTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevopsProjectTasksResponseBody getBody() {
        return this.body;
    }

}
