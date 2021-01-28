// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainUvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainUvDataResponseBody body;

    public static DescribeDcdnDomainUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainUvDataResponse self = new DescribeDcdnDomainUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainUvDataResponse setBody(DescribeDcdnDomainUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainUvDataResponseBody getBody() {
        return this.body;
    }

}
