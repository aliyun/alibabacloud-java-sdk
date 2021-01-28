// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnUserBillHistoryResponse setBody(DescribeDcdnUserBillHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserBillHistoryResponseBody getBody() {
        return this.body;
    }

}
