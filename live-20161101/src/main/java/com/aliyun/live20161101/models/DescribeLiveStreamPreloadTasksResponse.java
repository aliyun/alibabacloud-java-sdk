// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamPreloadTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamPreloadTasksResponseBody body;

    public static DescribeLiveStreamPreloadTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamPreloadTasksResponse self = new DescribeLiveStreamPreloadTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamPreloadTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamPreloadTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamPreloadTasksResponse setBody(DescribeLiveStreamPreloadTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamPreloadTasksResponseBody getBody() {
        return this.body;
    }

}
