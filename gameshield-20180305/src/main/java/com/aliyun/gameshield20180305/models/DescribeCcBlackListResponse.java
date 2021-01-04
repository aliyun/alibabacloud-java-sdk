// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcBlackListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcBlackListResponseBody body;

    public static DescribeCcBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcBlackListResponse self = new DescribeCcBlackListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcBlackListResponse setBody(DescribeCcBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcBlackListResponseBody getBody() {
        return this.body;
    }

}
