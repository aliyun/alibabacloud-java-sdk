// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetPermissionApplyOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPermissionApplyOrderDetailResponseBody body;

    public static GetPermissionApplyOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionApplyOrderDetailResponse self = new GetPermissionApplyOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetPermissionApplyOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPermissionApplyOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPermissionApplyOrderDetailResponse setBody(GetPermissionApplyOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPermissionApplyOrderDetailResponseBody getBody() {
        return this.body;
    }

}
