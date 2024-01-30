// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sResourceResponseBody body;

    public static UpdateK8sResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sResourceResponse self = new UpdateK8sResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sResourceResponse setBody(UpdateK8sResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sResourceResponseBody getBody() {
        return this.body;
    }

}
