// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBizSimpleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBizSimpleListResponseBody body;

    public static DescribeBizSimpleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizSimpleListResponse self = new DescribeBizSimpleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizSimpleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizSimpleListResponse setBody(DescribeBizSimpleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizSimpleListResponseBody getBody() {
        return this.body;
    }

}
