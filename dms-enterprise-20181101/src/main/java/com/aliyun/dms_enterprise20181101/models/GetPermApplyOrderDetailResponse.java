// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPermApplyOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPermApplyOrderDetailResponseBody body;

    public static GetPermApplyOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPermApplyOrderDetailResponse self = new GetPermApplyOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetPermApplyOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPermApplyOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPermApplyOrderDetailResponse setBody(GetPermApplyOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPermApplyOrderDetailResponseBody getBody() {
        return this.body;
    }

}
