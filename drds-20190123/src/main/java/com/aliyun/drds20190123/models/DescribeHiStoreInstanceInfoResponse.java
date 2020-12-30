// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHiStoreInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHiStoreInstanceInfoResponseBody body;

    public static DescribeHiStoreInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiStoreInstanceInfoResponse self = new DescribeHiStoreInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHiStoreInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHiStoreInstanceInfoResponse setBody(DescribeHiStoreInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHiStoreInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
