// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDtsJobConfigResponseBody body;

    public static DescribeDtsJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobConfigResponse self = new DescribeDtsJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDtsJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDtsJobConfigResponse setBody(DescribeDtsJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsJobConfigResponseBody getBody() {
        return this.body;
    }

}
