// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetApprovalDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApprovalDetailResponseBody body;

    public static GetApprovalDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalDetailResponse self = new GetApprovalDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetApprovalDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApprovalDetailResponse setBody(GetApprovalDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApprovalDetailResponseBody getBody() {
        return this.body;
    }

}
