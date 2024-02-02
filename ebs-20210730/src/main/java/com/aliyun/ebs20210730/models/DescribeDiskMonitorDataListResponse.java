// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskMonitorDataListResponseBody body;

    public static DescribeDiskMonitorDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataListResponse self = new DescribeDiskMonitorDataListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskMonitorDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskMonitorDataListResponse setBody(DescribeDiskMonitorDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskMonitorDataListResponseBody getBody() {
        return this.body;
    }

}
