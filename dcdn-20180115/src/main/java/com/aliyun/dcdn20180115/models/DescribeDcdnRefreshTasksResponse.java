// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnRefreshTasksResponseBody body;

    public static DescribeDcdnRefreshTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshTasksResponse self = new DescribeDcdnRefreshTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnRefreshTasksResponse setBody(DescribeDcdnRefreshTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRefreshTasksResponseBody getBody() {
        return this.body;
    }

}
