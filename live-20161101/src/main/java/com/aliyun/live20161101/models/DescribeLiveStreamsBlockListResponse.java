// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsBlockListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLiveStreamsBlockListResponse setBody(DescribeLiveStreamsBlockListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsBlockListResponseBody getBody() {
        return this.body;
    }

}
