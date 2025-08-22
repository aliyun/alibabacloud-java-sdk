// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModuleExamplesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExplorerRegistryModuleExamplesResponseBody body;

    public static ListExplorerRegistryModuleExamplesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModuleExamplesResponse self = new ListExplorerRegistryModuleExamplesResponse();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModuleExamplesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExplorerRegistryModuleExamplesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExplorerRegistryModuleExamplesResponse setBody(ListExplorerRegistryModuleExamplesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExplorerRegistryModuleExamplesResponseBody getBody() {
        return this.body;
    }

}
