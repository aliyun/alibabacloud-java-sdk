// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeliverListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnDeliverListResponseBody body;

    public static DescribeCdnDeliverListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeliverListResponse self = new DescribeCdnDeliverListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeliverListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDeliverListResponse setBody(DescribeCdnDeliverListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDeliverListResponseBody getBody() {
        return this.body;
    }

}
