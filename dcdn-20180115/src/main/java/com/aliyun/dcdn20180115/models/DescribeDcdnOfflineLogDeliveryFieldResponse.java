// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryFieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnOfflineLogDeliveryFieldResponseBody body;

    public static DescribeDcdnOfflineLogDeliveryFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryFieldResponse self = new DescribeDcdnOfflineLogDeliveryFieldResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnOfflineLogDeliveryFieldResponse setBody(DescribeDcdnOfflineLogDeliveryFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnOfflineLogDeliveryFieldResponseBody getBody() {
        return this.body;
    }

}
