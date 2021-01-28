// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnServiceResponseBody body;

    public static DescribeDcdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnServiceResponse self = new DescribeDcdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnServiceResponse setBody(DescribeDcdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnServiceResponseBody getBody() {
        return this.body;
    }

}
