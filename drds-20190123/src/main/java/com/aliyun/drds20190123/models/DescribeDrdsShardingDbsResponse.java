// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsShardingDbsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDrdsShardingDbsResponse setBody(DescribeDrdsShardingDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsShardingDbsResponseBody getBody() {
        return this.body;
    }

}
