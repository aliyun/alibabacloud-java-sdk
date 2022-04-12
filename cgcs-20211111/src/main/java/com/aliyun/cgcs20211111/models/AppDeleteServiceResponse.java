// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppDeleteServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppDeleteServiceResponseBody body;

    public static AppDeleteServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppDeleteServiceResponse self = new AppDeleteServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppDeleteServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppDeleteServiceResponse setBody(AppDeleteServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppDeleteServiceResponseBody getBody() {
        return this.body;
    }

}
