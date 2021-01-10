// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBoardsResponseBody body;

    public static DescribeBoardsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardsResponse self = new DescribeBoardsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBoardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBoardsResponse setBody(DescribeBoardsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBoardsResponseBody getBody() {
        return this.body;
    }

}
