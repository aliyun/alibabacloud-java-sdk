// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUHDUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterImsMediaConvertUHDUsageResponseBody body;

    public static DescribeMeterImsMediaConvertUHDUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMediaConvertUHDUsageResponse self = new DescribeMeterImsMediaConvertUHDUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMediaConvertUHDUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsMediaConvertUHDUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsMediaConvertUHDUsageResponse setBody(DescribeMeterImsMediaConvertUHDUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsMediaConvertUHDUsageResponseBody getBody() {
        return this.body;
    }

}
