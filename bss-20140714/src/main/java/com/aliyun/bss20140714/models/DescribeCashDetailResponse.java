// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCashDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCashDetailResponseBody body;

    public static DescribeCashDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCashDetailResponse self = new DescribeCashDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCashDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCashDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCashDetailResponse setBody(DescribeCashDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCashDetailResponseBody getBody() {
        return this.body;
    }

}
