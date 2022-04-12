// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionListServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppVersionListServiceResponseBody body;

    public static AppVersionListServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppVersionListServiceResponse self = new AppVersionListServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppVersionListServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppVersionListServiceResponse setBody(AppVersionListServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppVersionListServiceResponseBody getBody() {
        return this.body;
    }

}
