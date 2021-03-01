// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOwnerApplyOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOwnerApplyOrderDetailResponseBody body;

    public static GetOwnerApplyOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOwnerApplyOrderDetailResponse self = new GetOwnerApplyOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOwnerApplyOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOwnerApplyOrderDetailResponse setBody(GetOwnerApplyOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOwnerApplyOrderDetailResponseBody getBody() {
        return this.body;
    }

}
