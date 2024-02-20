// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveReplyMailAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ApproveReplyMailAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveReplyMailAddressResponse setBody(ApproveReplyMailAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveReplyMailAddressResponseBody getBody() {
        return this.body;
    }

}
