// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMax95BpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainMax95BpsDataResponseBody body;

    public static DescribeDomainMax95BpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMax95BpsDataResponse self = new DescribeDomainMax95BpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMax95BpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainMax95BpsDataResponse setBody(DescribeDomainMax95BpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainMax95BpsDataResponseBody getBody() {
        return this.body;
    }

}
