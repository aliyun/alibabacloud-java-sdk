// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnUserBillTypeResponseBody body;

    public static DescribeDcdnUserBillTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserBillTypeResponse self = new DescribeDcdnUserBillTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserBillTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserBillTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserBillTypeResponse setBody(DescribeDcdnUserBillTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserBillTypeResponseBody getBody() {
        return this.body;
    }

}
