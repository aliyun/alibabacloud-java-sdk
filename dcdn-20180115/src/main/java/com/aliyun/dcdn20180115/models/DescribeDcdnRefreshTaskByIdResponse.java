// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTaskByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnRefreshTaskByIdResponseBody body;

    public static DescribeDcdnRefreshTaskByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshTaskByIdResponse self = new DescribeDcdnRefreshTaskByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshTaskByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnRefreshTaskByIdResponse setBody(DescribeDcdnRefreshTaskByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRefreshTaskByIdResponseBody getBody() {
        return this.body;
    }

}
