// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDtsJobDetailResponseBody body;

    public static DescribeDtsJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobDetailResponse self = new DescribeDtsJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDtsJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDtsJobDetailResponse setBody(DescribeDtsJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsJobDetailResponseBody getBody() {
        return this.body;
    }

}
