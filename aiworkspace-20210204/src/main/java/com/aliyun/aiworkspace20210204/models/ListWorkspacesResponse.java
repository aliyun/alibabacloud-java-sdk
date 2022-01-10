// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkspacesResponseBody body;

    public static ListWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponse self = new ListWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspacesResponse setBody(ListWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspacesResponseBody getBody() {
        return this.body;
    }

}
