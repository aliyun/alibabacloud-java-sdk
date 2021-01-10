// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterRtcInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterRtcInfoResponseBody body;

    public static DescribeCasterRtcInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterRtcInfoResponse self = new DescribeCasterRtcInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterRtcInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterRtcInfoResponse setBody(DescribeCasterRtcInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterRtcInfoResponseBody getBody() {
        return this.body;
    }

}
