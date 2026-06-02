// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCreditPackageResponseBody body;

    public static DescribeCreditPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackageResponse self = new DescribeCreditPackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreditPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreditPackageResponse setBody(DescribeCreditPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreditPackageResponseBody getBody() {
        return this.body;
    }

}
