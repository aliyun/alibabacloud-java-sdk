// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcWhiteListResponseBody body;

    public static DescribeCcWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcWhiteListResponse self = new DescribeCcWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcWhiteListResponse setBody(DescribeCcWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcWhiteListResponseBody getBody() {
        return this.body;
    }

}
