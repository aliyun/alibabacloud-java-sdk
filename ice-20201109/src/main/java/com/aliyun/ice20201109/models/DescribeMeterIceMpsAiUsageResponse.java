// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceMpsAiUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterIceMpsAiUsageResponseBody body;

    public static DescribeMeterIceMpsAiUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceMpsAiUsageResponse self = new DescribeMeterIceMpsAiUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceMpsAiUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterIceMpsAiUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterIceMpsAiUsageResponse setBody(DescribeMeterIceMpsAiUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterIceMpsAiUsageResponseBody getBody() {
        return this.body;
    }

}
