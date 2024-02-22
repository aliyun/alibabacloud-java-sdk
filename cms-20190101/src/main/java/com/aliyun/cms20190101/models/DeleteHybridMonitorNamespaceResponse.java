// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHybridMonitorNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHybridMonitorNamespaceResponseBody body;

    public static DeleteHybridMonitorNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridMonitorNamespaceResponse self = new DeleteHybridMonitorNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHybridMonitorNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHybridMonitorNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHybridMonitorNamespaceResponse setBody(DeleteHybridMonitorNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHybridMonitorNamespaceResponseBody getBody() {
        return this.body;
    }

}
