// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveRecordUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterImsLiveRecordUsageResponseBody body;

    public static DescribeMeterImsLiveRecordUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveRecordUsageResponse self = new DescribeMeterImsLiveRecordUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveRecordUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsLiveRecordUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsLiveRecordUsageResponse setBody(DescribeMeterImsLiveRecordUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsLiveRecordUsageResponseBody getBody() {
        return this.body;
    }

}
