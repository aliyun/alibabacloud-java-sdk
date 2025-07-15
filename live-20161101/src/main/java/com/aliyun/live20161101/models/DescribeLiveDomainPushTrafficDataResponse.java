// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPushTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainPushTrafficDataResponseBody body;

    public static DescribeLiveDomainPushTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPushTrafficDataResponse self = new DescribeLiveDomainPushTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPushTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainPushTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainPushTrafficDataResponse setBody(DescribeLiveDomainPushTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainPushTrafficDataResponseBody getBody() {
        return this.body;
    }

}
