// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsControlHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamsControlHistoryResponseBody body;

    public static DescribeLiveStreamsControlHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsControlHistoryResponse self = new DescribeLiveStreamsControlHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsControlHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsControlHistoryResponse setBody(DescribeLiveStreamsControlHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsControlHistoryResponseBody getBody() {
        return this.body;
    }

}
