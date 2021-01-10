// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamCountResponseBody body;

    public static DescribeLiveStreamCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamCountResponse self = new DescribeLiveStreamCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamCountResponse setBody(DescribeLiveStreamCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamCountResponseBody getBody() {
        return this.body;
    }

}
