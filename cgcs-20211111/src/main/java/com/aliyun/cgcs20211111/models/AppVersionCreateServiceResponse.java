// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionCreateServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppVersionCreateServiceResponseBody body;

    public static AppVersionCreateServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppVersionCreateServiceResponse self = new AppVersionCreateServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppVersionCreateServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppVersionCreateServiceResponse setBody(AppVersionCreateServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppVersionCreateServiceResponseBody getBody() {
        return this.body;
    }

}
