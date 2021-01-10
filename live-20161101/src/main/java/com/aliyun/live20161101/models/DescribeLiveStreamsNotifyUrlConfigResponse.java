// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamsNotifyUrlConfigResponseBody body;

    public static DescribeLiveStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyUrlConfigResponse self = new DescribeLiveStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse setBody(DescribeLiveStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
