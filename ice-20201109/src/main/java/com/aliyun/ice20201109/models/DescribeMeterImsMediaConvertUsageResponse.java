// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterImsMediaConvertUsageResponseBody body;

    public static DescribeMeterImsMediaConvertUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMediaConvertUsageResponse self = new DescribeMeterImsMediaConvertUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMediaConvertUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsMediaConvertUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsMediaConvertUsageResponse setBody(DescribeMeterImsMediaConvertUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsMediaConvertUsageResponseBody getBody() {
        return this.body;
    }

}
