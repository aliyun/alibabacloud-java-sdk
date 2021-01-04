// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcSocketDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcSocketDetailResponseBody body;

    public static DescribeCcSocketDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcSocketDetailResponse self = new DescribeCcSocketDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcSocketDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcSocketDetailResponse setBody(DescribeCcSocketDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcSocketDetailResponseBody getBody() {
        return this.body;
    }

}
