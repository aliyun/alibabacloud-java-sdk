// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeliverListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDeliverListResponseBody body;

    public static DescribeDcdnDeliverListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeliverListResponse self = new DescribeDcdnDeliverListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeliverListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDeliverListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDeliverListResponse setBody(DescribeDcdnDeliverListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDeliverListResponseBody getBody() {
        return this.body;
    }

}
