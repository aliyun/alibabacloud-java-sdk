// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnTagResourcesResponseBody body;

    public static DescribeDcdnTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnTagResourcesResponse self = new DescribeDcdnTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnTagResourcesResponse setBody(DescribeDcdnTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnTagResourcesResponseBody getBody() {
        return this.body;
    }

}
