// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetK8sServicesResponse setBody(GetK8sServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetK8sServicesResponseBody getBody() {
        return this.body;
    }

}
