// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPermissionResponseBody body;

    public static GetPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionResponse self = new GetPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GetPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPermissionResponse setBody(GetPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPermissionResponseBody getBody() {
        return this.body;
    }

}
