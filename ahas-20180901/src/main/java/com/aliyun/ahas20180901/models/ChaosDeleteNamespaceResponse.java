// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosDeleteNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChaosDeleteNamespaceResponseBody body;

    public static ChaosDeleteNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ChaosDeleteNamespaceResponse self = new ChaosDeleteNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ChaosDeleteNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChaosDeleteNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChaosDeleteNamespaceResponse setBody(ChaosDeleteNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ChaosDeleteNamespaceResponseBody getBody() {
        return this.body;
    }

}
