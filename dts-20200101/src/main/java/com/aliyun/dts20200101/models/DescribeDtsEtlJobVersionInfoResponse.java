// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsEtlJobVersionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDtsEtlJobVersionInfoResponseBody body;

    public static DescribeDtsEtlJobVersionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsEtlJobVersionInfoResponse self = new DescribeDtsEtlJobVersionInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDtsEtlJobVersionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDtsEtlJobVersionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDtsEtlJobVersionInfoResponse setBody(DescribeDtsEtlJobVersionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsEtlJobVersionInfoResponseBody getBody() {
        return this.body;
    }

}
