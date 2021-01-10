// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeLogAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveRealtimeLogAuthorizedResponseBody body;

    public static DescribeLiveRealtimeLogAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeLogAuthorizedResponse self = new DescribeLiveRealtimeLogAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeLogAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRealtimeLogAuthorizedResponse setBody(DescribeLiveRealtimeLogAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRealtimeLogAuthorizedResponseBody getBody() {
        return this.body;
    }

}
