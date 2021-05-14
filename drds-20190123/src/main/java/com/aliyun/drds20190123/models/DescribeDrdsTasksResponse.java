// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsTasksResponseBody body;

    public static DescribeDrdsTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsTasksResponse self = new DescribeDrdsTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsTasksResponse setBody(DescribeDrdsTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsTasksResponseBody getBody() {
        return this.body;
    }

}
