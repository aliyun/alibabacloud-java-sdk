// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUidOnlineStreamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUidOnlineStreamsResponseBody body;

    public static DescribeUidOnlineStreamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUidOnlineStreamsResponse self = new DescribeUidOnlineStreamsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUidOnlineStreamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUidOnlineStreamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUidOnlineStreamsResponse setBody(DescribeUidOnlineStreamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUidOnlineStreamsResponseBody getBody() {
        return this.body;
    }

}
