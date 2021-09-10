// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApprovePermissionApplyOrderResponseBody body;

    public static ApprovePermissionApplyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ApprovePermissionApplyOrderResponse self = new ApprovePermissionApplyOrderResponse();
        return TeaModel.build(map, self);
    }

    public ApprovePermissionApplyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApprovePermissionApplyOrderResponse setBody(ApprovePermissionApplyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ApprovePermissionApplyOrderResponseBody getBody() {
        return this.body;
    }

}
