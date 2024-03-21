// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserBillHistoryResponseBody body;

    public static DescribeDcdnUserBillHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserBillHistoryResponse self = new DescribeDcdnUserBillHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserBillHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserBillHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserBillHistoryResponse setBody(DescribeDcdnUserBillHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserBillHistoryResponseBody getBody() {
        return this.body;
    }

}
