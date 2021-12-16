// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnEsExceptionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnEsExceptionDataResponseBody body;

    public static DescribeDcdnEsExceptionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnEsExceptionDataResponse self = new DescribeDcdnEsExceptionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnEsExceptionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnEsExceptionDataResponse setBody(DescribeDcdnEsExceptionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnEsExceptionDataResponseBody getBody() {
        return this.body;
    }

}
