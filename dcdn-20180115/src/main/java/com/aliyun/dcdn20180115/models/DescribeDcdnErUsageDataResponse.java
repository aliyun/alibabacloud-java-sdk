// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnErUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnErUsageDataResponseBody body;

    public static DescribeDcdnErUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnErUsageDataResponse self = new DescribeDcdnErUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnErUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnErUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnErUsageDataResponse setBody(DescribeDcdnErUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnErUsageDataResponseBody getBody() {
        return this.body;
    }

}
