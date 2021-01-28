// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnOfflineLogDeliveryRegionsResponseBody body;

    public static DescribeDcdnOfflineLogDeliveryRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryRegionsResponse self = new DescribeDcdnOfflineLogDeliveryRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnOfflineLogDeliveryRegionsResponse setBody(DescribeDcdnOfflineLogDeliveryRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnOfflineLogDeliveryRegionsResponseBody getBody() {
        return this.body;
    }

}
