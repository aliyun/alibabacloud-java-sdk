// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribePairDrillsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePairDrillsResponseBody body;

    public static DescribePairDrillsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePairDrillsResponse self = new DescribePairDrillsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePairDrillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePairDrillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePairDrillsResponse setBody(DescribePairDrillsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePairDrillsResponseBody getBody() {
        return this.body;
    }

}
