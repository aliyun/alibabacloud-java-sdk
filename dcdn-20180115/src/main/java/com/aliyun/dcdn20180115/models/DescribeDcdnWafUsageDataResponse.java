// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafUsageDataResponseBody body;

    public static DescribeDcdnWafUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafUsageDataResponse self = new DescribeDcdnWafUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafUsageDataResponse setBody(DescribeDcdnWafUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafUsageDataResponseBody getBody() {
        return this.body;
    }

}
