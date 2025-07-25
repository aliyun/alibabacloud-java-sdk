// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPvUvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainPvUvDataResponseBody body;

    public static DescribeLiveDomainPvUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPvUvDataResponse self = new DescribeLiveDomainPvUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPvUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainPvUvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainPvUvDataResponse setBody(DescribeLiveDomainPvUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainPvUvDataResponseBody getBody() {
        return this.body;
    }

}
