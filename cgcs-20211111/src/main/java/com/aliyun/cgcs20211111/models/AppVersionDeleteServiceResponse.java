// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionDeleteServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppVersionDeleteServiceResponseBody body;

    public static AppVersionDeleteServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppVersionDeleteServiceResponse self = new AppVersionDeleteServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppVersionDeleteServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppVersionDeleteServiceResponse setBody(AppVersionDeleteServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppVersionDeleteServiceResponseBody getBody() {
        return this.body;
    }

}
