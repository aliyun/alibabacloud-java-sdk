// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveLazyPullStreamConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveLazyPullStreamConfigResponseBody body;

    public static DescribeLiveLazyPullStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveLazyPullStreamConfigResponse self = new DescribeLiveLazyPullStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveLazyPullStreamConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveLazyPullStreamConfigResponse setBody(DescribeLiveLazyPullStreamConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveLazyPullStreamConfigResponseBody getBody() {
        return this.body;
    }

}
