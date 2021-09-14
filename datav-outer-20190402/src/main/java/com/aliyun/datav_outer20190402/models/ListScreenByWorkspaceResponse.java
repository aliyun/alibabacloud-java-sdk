// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListScreenByWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScreenByWorkspaceResponseBody body;

    public static ListScreenByWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScreenByWorkspaceResponse self = new ListScreenByWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListScreenByWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScreenByWorkspaceResponse setBody(ListScreenByWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScreenByWorkspaceResponseBody getBody() {
        return this.body;
    }

}
