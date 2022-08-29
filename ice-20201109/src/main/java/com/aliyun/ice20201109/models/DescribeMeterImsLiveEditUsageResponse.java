// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveEditUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterImsLiveEditUsageResponseBody body;

    public static DescribeMeterImsLiveEditUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveEditUsageResponse self = new DescribeMeterImsLiveEditUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveEditUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsLiveEditUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsLiveEditUsageResponse setBody(DescribeMeterImsLiveEditUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsLiveEditUsageResponseBody getBody() {
        return this.body;
    }

}
