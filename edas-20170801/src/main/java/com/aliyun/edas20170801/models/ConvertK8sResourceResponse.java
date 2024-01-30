// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ConvertK8sResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertK8sResourceResponseBody body;

    public static ConvertK8sResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertK8sResourceResponse self = new ConvertK8sResourceResponse();
        return TeaModel.build(map, self);
    }

    public ConvertK8sResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertK8sResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertK8sResourceResponse setBody(ConvertK8sResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertK8sResourceResponseBody getBody() {
        return this.body;
    }

}
