// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPermApplyOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetPermApplyOrderDetailResponse setBody(GetPermApplyOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPermApplyOrderDetailResponseBody getBody() {
        return this.body;
    }

}
