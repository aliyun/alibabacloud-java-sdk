// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppCreateServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppCreateServiceResponseBody body;

    public static AppCreateServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppCreateServiceResponse self = new AppCreateServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppCreateServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppCreateServiceResponse setBody(AppCreateServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppCreateServiceResponseBody getBody() {
        return this.body;
    }

}
