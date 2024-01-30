// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetK8sServicesResponseBody body;

    public static GetK8sServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetK8sServicesResponse self = new GetK8sServicesResponse();
        return TeaModel.build(map, self);
    }

    public GetK8sServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetK8sServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetK8sServicesResponse setBody(GetK8sServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetK8sServicesResponseBody getBody() {
        return this.body;
    }

}
