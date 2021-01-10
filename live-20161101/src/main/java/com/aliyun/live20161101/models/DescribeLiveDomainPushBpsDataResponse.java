// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPushBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainPushBpsDataResponseBody body;

    public static DescribeLiveDomainPushBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPushBpsDataResponse self = new DescribeLiveDomainPushBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPushBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainPushBpsDataResponse setBody(DescribeLiveDomainPushBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainPushBpsDataResponseBody getBody() {
        return this.body;
    }

}
