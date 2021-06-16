// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSubListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnSubListResponseBody body;

    public static DescribeCdnSubListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSubListResponse self = new DescribeCdnSubListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSubListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnSubListResponse setBody(DescribeCdnSubListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnSubListResponseBody getBody() {
        return this.body;
    }

}
