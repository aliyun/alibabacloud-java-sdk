// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceLiveMediaConvertUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterIceLiveMediaConvertUsageResponseBody body;

    public static DescribeMeterIceLiveMediaConvertUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceLiveMediaConvertUsageResponse self = new DescribeMeterIceLiveMediaConvertUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceLiveMediaConvertUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterIceLiveMediaConvertUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterIceLiveMediaConvertUsageResponse setBody(DescribeMeterIceLiveMediaConvertUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterIceLiveMediaConvertUsageResponseBody getBody() {
        return this.body;
    }

}
