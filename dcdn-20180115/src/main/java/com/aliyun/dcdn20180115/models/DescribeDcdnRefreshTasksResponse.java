// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDcdnRefreshTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnRefreshTasksResponse setBody(DescribeDcdnRefreshTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRefreshTasksResponseBody getBody() {
        return this.body;
    }

}
