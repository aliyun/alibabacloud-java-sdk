// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeBizChainStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBizChainStatInfoResponseBody body;

    public static DescribeBizChainStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizChainStatInfoResponse self = new DescribeBizChainStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizChainStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizChainStatInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBizChainStatInfoResponse setBody(DescribeBizChainStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizChainStatInfoResponseBody getBody() {
        return this.body;
    }

}
