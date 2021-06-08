// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeliverListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDeliverListResponse setBody(DescribeDcdnDeliverListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDeliverListResponseBody getBody() {
        return this.body;
    }

}
