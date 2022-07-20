// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceMediaConvertUHDUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterIceMediaConvertUHDUsageResponseBody body;

    public static DescribeMeterIceMediaConvertUHDUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceMediaConvertUHDUsageResponse self = new DescribeMeterIceMediaConvertUHDUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceMediaConvertUHDUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterIceMediaConvertUHDUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterIceMediaConvertUHDUsageResponse setBody(DescribeMeterIceMediaConvertUHDUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterIceMediaConvertUHDUsageResponseBody getBody() {
        return this.body;
    }

}
