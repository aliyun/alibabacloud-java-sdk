// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnBgpTrafficDataResponseBody body;

    public static DescribeDcdnBgpTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBgpTrafficDataResponse self = new DescribeDcdnBgpTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBgpTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnBgpTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnBgpTrafficDataResponse setBody(DescribeDcdnBgpTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnBgpTrafficDataResponseBody getBody() {
        return this.body;
    }

}
