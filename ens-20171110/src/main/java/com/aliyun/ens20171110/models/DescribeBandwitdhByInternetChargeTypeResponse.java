// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeBandwitdhByInternetChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBandwitdhByInternetChargeTypeResponseBody body;

    public static DescribeBandwitdhByInternetChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwitdhByInternetChargeTypeResponse self = new DescribeBandwitdhByInternetChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwitdhByInternetChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBandwitdhByInternetChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBandwitdhByInternetChargeTypeResponse setBody(DescribeBandwitdhByInternetChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwitdhByInternetChargeTypeResponseBody getBody() {
        return this.body;
    }

}
