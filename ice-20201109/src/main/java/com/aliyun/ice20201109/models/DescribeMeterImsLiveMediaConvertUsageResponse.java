// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveMediaConvertUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterImsLiveMediaConvertUsageResponseBody body;

    public static DescribeMeterImsLiveMediaConvertUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveMediaConvertUsageResponse self = new DescribeMeterImsLiveMediaConvertUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveMediaConvertUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsLiveMediaConvertUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsLiveMediaConvertUsageResponse setBody(DescribeMeterImsLiveMediaConvertUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsLiveMediaConvertUsageResponseBody getBody() {
        return this.body;
    }

}
