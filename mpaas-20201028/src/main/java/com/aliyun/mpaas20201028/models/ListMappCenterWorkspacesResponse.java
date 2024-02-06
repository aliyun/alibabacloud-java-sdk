// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMappCenterWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListMappCenterWorkspacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMappCenterWorkspacesResponse setBody(ListMappCenterWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMappCenterWorkspacesResponseBody getBody() {
        return this.body;
    }

}
