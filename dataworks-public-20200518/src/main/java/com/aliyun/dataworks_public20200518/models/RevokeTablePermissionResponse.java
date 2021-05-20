// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeTablePermissionResponseBody body;

    public static RevokeTablePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeTablePermissionResponse self = new RevokeTablePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeTablePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeTablePermissionResponse setBody(RevokeTablePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeTablePermissionResponseBody getBody() {
        return this.body;
    }

}
