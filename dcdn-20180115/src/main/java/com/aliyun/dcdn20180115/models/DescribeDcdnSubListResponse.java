// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSubListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnSubListResponseBody body;

    public static DescribeDcdnSubListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSubListResponse self = new DescribeDcdnSubListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSubListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSubListResponse setBody(DescribeDcdnSubListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSubListResponseBody getBody() {
        return this.body;
    }

}
