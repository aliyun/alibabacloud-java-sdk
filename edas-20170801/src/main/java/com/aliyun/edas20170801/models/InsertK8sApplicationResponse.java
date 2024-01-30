// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertK8sApplicationResponseBody body;

    public static InsertK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertK8sApplicationResponse self = new InsertK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public InsertK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertK8sApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertK8sApplicationResponse setBody(InsertK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
