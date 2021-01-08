// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevopsProjectTaskListResponseBody body;

    public static ListDevopsProjectTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTaskListResponse self = new ListDevopsProjectTaskListResponse();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevopsProjectTaskListResponse setBody(ListDevopsProjectTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevopsProjectTaskListResponseBody getBody() {
        return this.body;
    }

}
