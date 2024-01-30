// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListK8sSecretsResponseBody body;

    public static ListK8sSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8sSecretsResponse self = new ListK8sSecretsResponse();
        return TeaModel.build(map, self);
    }

    public ListK8sSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8sSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8sSecretsResponse setBody(ListK8sSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8sSecretsResponseBody getBody() {
        return this.body;
    }

}
