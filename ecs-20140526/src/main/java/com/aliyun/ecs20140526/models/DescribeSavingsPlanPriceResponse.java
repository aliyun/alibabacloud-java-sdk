// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlanPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSavingsPlanPriceResponseBody body;

    public static DescribeSavingsPlanPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlanPriceResponse self = new DescribeSavingsPlanPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlanPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSavingsPlanPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSavingsPlanPriceResponse setBody(DescribeSavingsPlanPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSavingsPlanPriceResponseBody getBody() {
        return this.body;
    }

}
