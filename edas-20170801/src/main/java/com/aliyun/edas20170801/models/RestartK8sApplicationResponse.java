// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RestartK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartK8sApplicationResponseBody body;

    public static RestartK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartK8sApplicationResponse self = new RestartK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RestartK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartK8sApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartK8sApplicationResponse setBody(RestartK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
