// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveReplyMailAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveReplyMailAddressResponseBody body;

    public static ApproveReplyMailAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveReplyMailAddressResponse self = new ApproveReplyMailAddressResponse();
        return TeaModel.build(map, self);
    }

    public ApproveReplyMailAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveReplyMailAddressResponse setBody(ApproveReplyMailAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveReplyMailAddressResponseBody getBody() {
        return this.body;
    }

}
