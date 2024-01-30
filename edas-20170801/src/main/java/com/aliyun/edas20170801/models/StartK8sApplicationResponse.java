// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StartK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartK8sApplicationResponseBody body;

    public static StartK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartK8sApplicationResponse self = new StartK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public StartK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartK8sApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartK8sApplicationResponse setBody(StartK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
