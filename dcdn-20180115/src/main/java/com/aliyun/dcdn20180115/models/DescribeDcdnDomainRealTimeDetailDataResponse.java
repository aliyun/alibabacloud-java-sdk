// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeDetailDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainRealTimeDetailDataResponseBody body;

    public static DescribeDcdnDomainRealTimeDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeDetailDataResponse self = new DescribeDcdnDomainRealTimeDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeDetailDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeDetailDataResponse setBody(DescribeDcdnDomainRealTimeDetailDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeDetailDataResponseBody getBody() {
        return this.body;
    }

}
