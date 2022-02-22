// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckPermissionsResponseBody body;

    public static CheckPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPermissionsResponse self = new CheckPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public CheckPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckPermissionsResponse setBody(CheckPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckPermissionsResponseBody getBody() {
        return this.body;
    }

}
