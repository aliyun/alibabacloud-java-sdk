// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsShardingDbsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsShardingDbsResponseBody body;

    public static DescribeDrdsShardingDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsShardingDbsResponse self = new DescribeDrdsShardingDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsShardingDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsShardingDbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsShardingDbsResponse setBody(DescribeDrdsShardingDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsShardingDbsResponseBody getBody() {
        return this.body;
    }

}
