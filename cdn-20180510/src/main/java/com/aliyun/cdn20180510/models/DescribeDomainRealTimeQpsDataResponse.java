// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainRealTimeQpsDataResponseBody body;

    public static DescribeDomainRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeQpsDataResponse self = new DescribeDomainRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeQpsDataResponse setBody(DescribeDomainRealTimeQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeQpsDataResponseBody getBody() {
        return this.body;
    }

}
