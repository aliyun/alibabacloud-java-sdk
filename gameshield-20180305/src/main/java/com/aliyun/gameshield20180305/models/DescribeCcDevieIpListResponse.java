// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcDevieIpListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcDevieIpListResponseBody body;

    public static DescribeCcDevieIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcDevieIpListResponse self = new DescribeCcDevieIpListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcDevieIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcDevieIpListResponse setBody(DescribeCcDevieIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcDevieIpListResponseBody getBody() {
        return this.body;
    }

}
