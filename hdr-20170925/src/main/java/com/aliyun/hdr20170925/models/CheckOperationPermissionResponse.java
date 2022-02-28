// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckOperationPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckOperationPermissionResponseBody body;

    public static CheckOperationPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOperationPermissionResponse self = new CheckOperationPermissionResponse();
        return TeaModel.build(map, self);
    }

    public CheckOperationPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOperationPermissionResponse setBody(CheckOperationPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOperationPermissionResponseBody getBody() {
        return this.body;
    }

}
