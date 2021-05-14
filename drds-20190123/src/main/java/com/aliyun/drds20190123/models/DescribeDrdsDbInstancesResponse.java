// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDbInstancesResponseBody body;

    public static DescribeDrdsDbInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstancesResponse self = new DescribeDrdsDbInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDbInstancesResponse setBody(DescribeDrdsDbInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDbInstancesResponseBody getBody() {
        return this.body;
    }

}
