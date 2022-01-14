// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMappCenterWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMappCenterWorkspacesResponseBody body;

    public static ListMappCenterWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMappCenterWorkspacesResponse self = new ListMappCenterWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public ListMappCenterWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMappCenterWorkspacesResponse setBody(ListMappCenterWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMappCenterWorkspacesResponseBody getBody() {
        return this.body;
    }

}
