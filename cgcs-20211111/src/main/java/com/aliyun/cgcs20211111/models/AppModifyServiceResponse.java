// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppModifyServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppModifyServiceResponseBody body;

    public static AppModifyServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AppModifyServiceResponse self = new AppModifyServiceResponse();
        return TeaModel.build(map, self);
    }

    public AppModifyServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppModifyServiceResponse setBody(AppModifyServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AppModifyServiceResponseBody getBody() {
        return this.body;
    }

}
