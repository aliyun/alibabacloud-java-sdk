// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sServiceResponseBody body;

    public static UpdateK8sServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sServiceResponse self = new UpdateK8sServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sServiceResponse setBody(UpdateK8sServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sServiceResponseBody getBody() {
        return this.body;
    }

}
