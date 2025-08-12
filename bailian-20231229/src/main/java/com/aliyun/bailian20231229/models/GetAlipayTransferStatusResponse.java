// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAlipayTransferStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlipayTransferStatusResponseBody body;

    public static GetAlipayTransferStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayTransferStatusResponse self = new GetAlipayTransferStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAlipayTransferStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlipayTransferStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlipayTransferStatusResponse setBody(GetAlipayTransferStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlipayTransferStatusResponseBody getBody() {
        return this.body;
    }

}
