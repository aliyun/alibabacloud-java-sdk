// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnConfigGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnConfigGroupDetailResponseBody body;

    public static DescribeDcdnConfigGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnConfigGroupDetailResponse self = new DescribeDcdnConfigGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnConfigGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnConfigGroupDetailResponse setBody(DescribeDcdnConfigGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnConfigGroupDetailResponseBody getBody() {
        return this.body;
    }

}
