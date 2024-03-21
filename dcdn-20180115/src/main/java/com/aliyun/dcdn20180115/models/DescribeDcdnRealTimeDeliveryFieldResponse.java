// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRealTimeDeliveryFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnRealTimeDeliveryFieldResponseBody body;

    public static DescribeDcdnRealTimeDeliveryFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRealTimeDeliveryFieldResponse self = new DescribeDcdnRealTimeDeliveryFieldResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRealTimeDeliveryFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnRealTimeDeliveryFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnRealTimeDeliveryFieldResponse setBody(DescribeDcdnRealTimeDeliveryFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRealTimeDeliveryFieldResponseBody getBody() {
        return this.body;
    }

}
