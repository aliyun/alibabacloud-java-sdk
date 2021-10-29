// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsInstancesResponseBody body;

    public static DescribeDrdsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstancesResponse self = new DescribeDrdsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstancesResponse setBody(DescribeDrdsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstancesResponseBody getBody() {
        return this.body;
    }

}
