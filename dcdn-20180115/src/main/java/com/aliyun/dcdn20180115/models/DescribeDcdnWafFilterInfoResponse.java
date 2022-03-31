// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafFilterInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnWafFilterInfoResponseBody body;

    public static DescribeDcdnWafFilterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafFilterInfoResponse self = new DescribeDcdnWafFilterInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafFilterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafFilterInfoResponse setBody(DescribeDcdnWafFilterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafFilterInfoResponseBody getBody() {
        return this.body;
    }

}
