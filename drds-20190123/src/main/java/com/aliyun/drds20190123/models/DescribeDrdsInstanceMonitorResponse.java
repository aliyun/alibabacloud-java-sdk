// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsInstanceMonitorResponseBody body;

    public static DescribeDrdsInstanceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceMonitorResponse self = new DescribeDrdsInstanceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstanceMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsInstanceMonitorResponse setBody(DescribeDrdsInstanceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstanceMonitorResponseBody getBody() {
        return this.body;
    }

}
