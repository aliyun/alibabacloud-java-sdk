// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryModuleVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRegistryModuleVersionsResponseBody body;

    public static ListRegistryModuleVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryModuleVersionsResponse self = new ListRegistryModuleVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRegistryModuleVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegistryModuleVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegistryModuleVersionsResponse setBody(ListRegistryModuleVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegistryModuleVersionsResponseBody getBody() {
        return this.body;
    }

}
