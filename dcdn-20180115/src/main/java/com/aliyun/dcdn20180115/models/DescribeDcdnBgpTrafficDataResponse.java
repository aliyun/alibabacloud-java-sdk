// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnBgpTrafficDataResponseBody body;

    public static DescribeDcdnBgpTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBgpTrafficDataResponse self = new DescribeDcdnBgpTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBgpTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnBgpTrafficDataResponse setBody(DescribeDcdnBgpTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnBgpTrafficDataResponseBody getBody() {
        return this.body;
    }

}
