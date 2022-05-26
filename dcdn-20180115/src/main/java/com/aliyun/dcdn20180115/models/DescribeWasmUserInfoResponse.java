// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeWasmUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWasmUserInfoResponseBody body;

    public static DescribeWasmUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWasmUserInfoResponse self = new DescribeWasmUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWasmUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWasmUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWasmUserInfoResponse setBody(DescribeWasmUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWasmUserInfoResponseBody getBody() {
        return this.body;
    }

}
