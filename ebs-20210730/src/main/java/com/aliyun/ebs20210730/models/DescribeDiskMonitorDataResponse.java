// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskMonitorDataResponseBody body;

    public static DescribeDiskMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataResponse self = new DescribeDiskMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskMonitorDataResponse setBody(DescribeDiskMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskMonitorDataResponseBody getBody() {
        return this.body;
    }

}
