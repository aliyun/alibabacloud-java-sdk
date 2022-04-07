// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnWafServiceResponseBody body;

    public static DescribeDcdnWafServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafServiceResponse self = new DescribeDcdnWafServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafServiceResponse setBody(DescribeDcdnWafServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafServiceResponseBody getBody() {
        return this.body;
    }

}
