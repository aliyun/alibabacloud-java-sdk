// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePermissionApplyOrderResponseBody body;

    public static CreatePermissionApplyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionApplyOrderResponse self = new CreatePermissionApplyOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePermissionApplyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePermissionApplyOrderResponse setBody(CreatePermissionApplyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePermissionApplyOrderResponseBody getBody() {
        return this.body;
    }

}
