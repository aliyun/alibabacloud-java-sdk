// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBizListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBizListResponseBody body;

    public static DescribeBizListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizListResponse self = new DescribeBizListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizListResponse setBody(DescribeBizListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizListResponseBody getBody() {
        return this.body;
    }

}
