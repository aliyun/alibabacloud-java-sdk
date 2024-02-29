// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ApprovePermissionApplyOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApprovePermissionApplyOrderResponse setBody(ApprovePermissionApplyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ApprovePermissionApplyOrderResponseBody getBody() {
        return this.body;
    }

}
