// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDbTasksResponseBody body;

    public static DescribeDrdsDbTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbTasksResponse self = new DescribeDrdsDbTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDbTasksResponse setBody(DescribeDrdsDbTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDbTasksResponseBody getBody() {
        return this.body;
    }

}
