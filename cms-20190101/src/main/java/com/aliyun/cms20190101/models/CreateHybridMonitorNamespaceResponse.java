// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridMonitorNamespaceResponseBody body;

    public static CreateHybridMonitorNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridMonitorNamespaceResponse self = new CreateHybridMonitorNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridMonitorNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridMonitorNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridMonitorNamespaceResponse setBody(CreateHybridMonitorNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridMonitorNamespaceResponseBody getBody() {
        return this.body;
    }

}
