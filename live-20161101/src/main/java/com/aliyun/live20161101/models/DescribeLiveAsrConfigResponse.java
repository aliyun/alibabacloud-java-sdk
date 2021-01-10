// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAsrConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveAsrConfigResponseBody body;

    public static DescribeLiveAsrConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAsrConfigResponse self = new DescribeLiveAsrConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAsrConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveAsrConfigResponse setBody(DescribeLiveAsrConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveAsrConfigResponseBody getBody() {
        return this.body;
    }

}
