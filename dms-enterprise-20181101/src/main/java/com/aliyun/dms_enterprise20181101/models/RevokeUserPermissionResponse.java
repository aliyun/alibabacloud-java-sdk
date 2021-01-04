// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeUserPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeUserPermissionResponseBody body;

    public static RevokeUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeUserPermissionResponse self = new RevokeUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeUserPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeUserPermissionResponse setBody(RevokeUserPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeUserPermissionResponseBody getBody() {
        return this.body;
    }

}
