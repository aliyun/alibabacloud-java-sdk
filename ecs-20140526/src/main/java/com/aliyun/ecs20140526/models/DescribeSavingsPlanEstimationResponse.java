// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlanEstimationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSavingsPlanEstimationResponseBody body;

    public static DescribeSavingsPlanEstimationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlanEstimationResponse self = new DescribeSavingsPlanEstimationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlanEstimationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSavingsPlanEstimationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSavingsPlanEstimationResponse setBody(DescribeSavingsPlanEstimationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSavingsPlanEstimationResponseBody getBody() {
        return this.body;
    }

}
