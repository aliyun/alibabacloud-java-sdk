// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionGetServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppVersionGetServiceResponseBody body;

    public static AppVersionGetServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppVersionGetServiceResponse self = new AppVersionGetServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppVersionGetServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppVersionGetServiceResponse setBody(AppVersionGetServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppVersionGetServiceResponseBody getBody() {
        return this.body;
    }

}
