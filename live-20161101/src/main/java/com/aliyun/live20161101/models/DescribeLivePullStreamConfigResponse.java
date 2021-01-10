// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullStreamConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLivePullStreamConfigResponseBody body;

    public static DescribeLivePullStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullStreamConfigResponse self = new DescribeLivePullStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullStreamConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePullStreamConfigResponse setBody(DescribeLivePullStreamConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePullStreamConfigResponseBody getBody() {
        return this.body;
    }

}
