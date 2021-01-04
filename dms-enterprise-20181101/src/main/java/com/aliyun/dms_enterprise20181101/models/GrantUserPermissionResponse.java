// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantUserPermissionResponseBody body;

    public static GrantUserPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionResponse self = new GrantUserPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantUserPermissionResponse setBody(GrantUserPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantUserPermissionResponseBody getBody() {
        return this.body;
    }

}
