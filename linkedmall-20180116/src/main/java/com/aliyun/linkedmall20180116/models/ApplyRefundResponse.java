// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyRefundResponseBody body;

    public static ApplyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundResponse self = new ApplyRefundResponse();
        return TeaModel.build(map, self);
    }

    public ApplyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyRefundResponse setBody(ApplyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyRefundResponseBody getBody() {
        return this.body;
    }

}
