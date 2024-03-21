// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserRealTimeDeliveryFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserRealTimeDeliveryFieldResponseBody body;

    public static DescribeDcdnUserRealTimeDeliveryFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserRealTimeDeliveryFieldResponse self = new DescribeDcdnUserRealTimeDeliveryFieldResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserRealTimeDeliveryFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserRealTimeDeliveryFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserRealTimeDeliveryFieldResponse setBody(DescribeDcdnUserRealTimeDeliveryFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserRealTimeDeliveryFieldResponseBody getBody() {
        return this.body;
    }

}
