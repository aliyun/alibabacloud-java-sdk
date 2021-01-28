// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnIpInfoResponseBody body;

    public static DescribeDcdnIpInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpInfoResponse self = new DescribeDcdnIpInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpInfoResponse setBody(DescribeDcdnIpInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpInfoResponseBody getBody() {
        return this.body;
    }

}
