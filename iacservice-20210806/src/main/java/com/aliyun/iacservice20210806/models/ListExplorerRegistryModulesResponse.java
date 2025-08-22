// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExplorerRegistryModulesResponseBody body;

    public static ListExplorerRegistryModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModulesResponse self = new ListExplorerRegistryModulesResponse();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExplorerRegistryModulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExplorerRegistryModulesResponse setBody(ListExplorerRegistryModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExplorerRegistryModulesResponseBody getBody() {
        return this.body;
    }

}
