// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceMediaConvertUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterIceMediaConvertUsageResponseBody body;

    public static DescribeMeterIceMediaConvertUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceMediaConvertUsageResponse self = new DescribeMeterIceMediaConvertUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceMediaConvertUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterIceMediaConvertUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterIceMediaConvertUsageResponse setBody(DescribeMeterIceMediaConvertUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterIceMediaConvertUsageResponseBody getBody() {
        return this.body;
    }

}
