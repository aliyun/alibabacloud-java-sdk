// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ApproveOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveOrderResponseBody body;

    public static ApproveOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveOrderResponse self = new ApproveOrderResponse();
        return TeaModel.build(map, self);
    }

    public ApproveOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveOrderResponse setBody(ApproveOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveOrderResponseBody getBody() {
        return this.body;
    }

}
