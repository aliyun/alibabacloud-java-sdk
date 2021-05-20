// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeColumnPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeColumnPermissionResponseBody body;

    public static RevokeColumnPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeColumnPermissionResponse self = new RevokeColumnPermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeColumnPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeColumnPermissionResponse setBody(RevokeColumnPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeColumnPermissionResponseBody getBody() {
        return this.body;
    }

}
