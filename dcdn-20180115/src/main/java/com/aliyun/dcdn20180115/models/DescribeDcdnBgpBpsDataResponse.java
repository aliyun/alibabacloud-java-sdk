// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnBgpBpsDataResponseBody body;

    public static DescribeDcdnBgpBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBgpBpsDataResponse self = new DescribeDcdnBgpBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBgpBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnBgpBpsDataResponse setBody(DescribeDcdnBgpBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnBgpBpsDataResponseBody getBody() {
        return this.body;
    }

}
