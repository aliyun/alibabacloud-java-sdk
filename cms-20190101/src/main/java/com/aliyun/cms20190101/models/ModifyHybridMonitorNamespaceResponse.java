// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridMonitorNamespaceResponseBody body;

    public static ModifyHybridMonitorNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorNamespaceResponse self = new ModifyHybridMonitorNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridMonitorNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridMonitorNamespaceResponse setBody(ModifyHybridMonitorNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridMonitorNamespaceResponseBody getBody() {
        return this.body;
    }

}
