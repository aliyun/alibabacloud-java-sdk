// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentCommodityResponseBody body;

    public static SegmentCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityResponse self = new SegmentCommodityResponse();
        return TeaModel.build(map, self);
    }

    public SegmentCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentCommodityResponse setBody(SegmentCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentCommodityResponseBody getBody() {
        return this.body;
    }

}
