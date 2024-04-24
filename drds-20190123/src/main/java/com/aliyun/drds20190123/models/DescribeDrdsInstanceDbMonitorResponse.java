// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceDbMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsInstanceDbMonitorResponseBody body;

    public static DescribeDrdsInstanceDbMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceDbMonitorResponse self = new DescribeDrdsInstanceDbMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceDbMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstanceDbMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsInstanceDbMonitorResponse setBody(DescribeDrdsInstanceDbMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstanceDbMonitorResponseBody getBody() {
        return this.body;
    }

}
