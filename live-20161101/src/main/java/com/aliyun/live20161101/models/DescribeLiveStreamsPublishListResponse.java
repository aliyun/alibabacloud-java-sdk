// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsPublishListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamsPublishListResponseBody body;

    public static DescribeLiveStreamsPublishListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsPublishListResponse self = new DescribeLiveStreamsPublishListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsPublishListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsPublishListResponse setBody(DescribeLiveStreamsPublishListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsPublishListResponseBody getBody() {
        return this.body;
    }

}
