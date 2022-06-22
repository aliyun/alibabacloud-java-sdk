// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AppProtectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AppProtectionsResponseBody body;

    public static AppProtectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        AppProtectionsResponse self = new AppProtectionsResponse();
        return TeaModel.build(map, self);
    }

    public AppProtectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppProtectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppProtectionsResponse setBody(AppProtectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public AppProtectionsResponseBody getBody() {
        return this.body;
    }

}
