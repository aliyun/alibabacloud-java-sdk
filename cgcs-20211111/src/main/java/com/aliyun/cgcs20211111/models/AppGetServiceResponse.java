// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppGetServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppGetServiceResponseBody body;

    public static AppGetServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppGetServiceResponse self = new AppGetServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppGetServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppGetServiceResponse setBody(AppGetServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppGetServiceResponseBody getBody() {
        return this.body;
    }

}
