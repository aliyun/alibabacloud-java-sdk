// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsOnlineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamsOnlineListResponseBody body;

    public static DescribeLiveStreamsOnlineListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsOnlineListResponse self = new DescribeLiveStreamsOnlineListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsOnlineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsOnlineListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamsOnlineListResponse setBody(DescribeLiveStreamsOnlineListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsOnlineListResponseBody getBody() {
        return this.body;
    }

}
