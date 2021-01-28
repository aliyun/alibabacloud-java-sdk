// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainRealTimeQpsDataResponseBody body;

    public static DescribeDcdnDomainRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeQpsDataResponse self = new DescribeDcdnDomainRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeQpsDataResponse setBody(DescribeDcdnDomainRealTimeQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeQpsDataResponseBody getBody() {
        return this.body;
    }

}
