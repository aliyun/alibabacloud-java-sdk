// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModuleVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExplorerRegistryModuleVersionsResponseBody body;

    public static ListExplorerRegistryModuleVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModuleVersionsResponse self = new ListExplorerRegistryModuleVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModuleVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExplorerRegistryModuleVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExplorerRegistryModuleVersionsResponse setBody(ListExplorerRegistryModuleVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExplorerRegistryModuleVersionsResponseBody getBody() {
        return this.body;
    }

}
