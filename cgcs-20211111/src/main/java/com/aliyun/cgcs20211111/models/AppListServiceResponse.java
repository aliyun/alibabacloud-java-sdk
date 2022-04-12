// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppListServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppListServiceResponseBody body;

    public static AppListServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppListServiceResponse self = new AppListServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppListServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppListServiceResponse setBody(AppListServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppListServiceResponseBody getBody() {
        return this.body;
    }

}
