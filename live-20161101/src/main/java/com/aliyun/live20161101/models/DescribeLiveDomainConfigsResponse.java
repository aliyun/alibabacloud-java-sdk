// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainConfigsResponseBody body;

    public static DescribeLiveDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainConfigsResponse self = new DescribeLiveDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainConfigsResponse setBody(DescribeLiveDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
