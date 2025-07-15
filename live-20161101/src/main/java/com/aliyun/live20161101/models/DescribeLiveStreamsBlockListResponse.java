// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsBlockListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamsBlockListResponseBody body;

    public static DescribeLiveStreamsBlockListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsBlockListResponse self = new DescribeLiveStreamsBlockListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsBlockListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsBlockListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamsBlockListResponse setBody(DescribeLiveStreamsBlockListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsBlockListResponseBody getBody() {
        return this.body;
    }

}
