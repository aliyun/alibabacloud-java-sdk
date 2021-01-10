// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody body;

    public static DescribeLiveDomainRealTimeHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeHttpCodeDataResponse self = new DescribeLiveDomainRealTimeHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse setBody(DescribeLiveDomainRealTimeHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainRealTimeHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
