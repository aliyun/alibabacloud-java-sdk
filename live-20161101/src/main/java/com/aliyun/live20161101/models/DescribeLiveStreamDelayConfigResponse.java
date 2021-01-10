// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamDelayConfigResponseBody body;

    public static DescribeLiveStreamDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamDelayConfigResponse self = new DescribeLiveStreamDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamDelayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamDelayConfigResponse setBody(DescribeLiveStreamDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseBody getBody() {
        return this.body;
    }

}
