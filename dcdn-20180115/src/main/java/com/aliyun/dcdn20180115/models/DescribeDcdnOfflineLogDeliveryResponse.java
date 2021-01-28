// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnOfflineLogDeliveryResponseBody body;

    public static DescribeDcdnOfflineLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryResponse self = new DescribeDcdnOfflineLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnOfflineLogDeliveryResponse setBody(DescribeDcdnOfflineLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnOfflineLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
