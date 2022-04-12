// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionModifyServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppVersionModifyServiceResponseBody body;

    public static AppVersionModifyServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppVersionModifyServiceResponse self = new AppVersionModifyServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppVersionModifyServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppVersionModifyServiceResponse setBody(AppVersionModifyServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppVersionModifyServiceResponseBody getBody() {
        return this.body;
    }

}
