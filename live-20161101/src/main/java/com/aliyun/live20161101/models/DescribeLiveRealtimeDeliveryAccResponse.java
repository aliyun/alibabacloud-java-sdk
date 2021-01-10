// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeDeliveryAccResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveRealtimeDeliveryAccResponseBody body;

    public static DescribeLiveRealtimeDeliveryAccResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeDeliveryAccResponse self = new DescribeLiveRealtimeDeliveryAccResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeDeliveryAccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRealtimeDeliveryAccResponse setBody(DescribeLiveRealtimeDeliveryAccResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRealtimeDeliveryAccResponseBody getBody() {
        return this.body;
    }

}
