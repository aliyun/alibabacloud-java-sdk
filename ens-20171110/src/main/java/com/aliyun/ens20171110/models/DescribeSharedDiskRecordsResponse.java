// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSharedDiskRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSharedDiskRecordsResponseBody body;

    public static DescribeSharedDiskRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharedDiskRecordsResponse self = new DescribeSharedDiskRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSharedDiskRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSharedDiskRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSharedDiskRecordsResponse setBody(DescribeSharedDiskRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSharedDiskRecordsResponseBody getBody() {
        return this.body;
    }

}
