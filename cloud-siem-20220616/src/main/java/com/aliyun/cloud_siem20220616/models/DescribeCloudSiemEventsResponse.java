// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCloudSiemEventsResponseBody body;

    public static DescribeCloudSiemEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventsResponse self = new DescribeCloudSiemEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudSiemEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudSiemEventsResponse setBody(DescribeCloudSiemEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudSiemEventsResponseBody getBody() {
        return this.body;
    }

}
