// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDatasetItemInfoResponseBody body;

    public static DescribeDatasetItemInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetItemInfoResponse self = new DescribeDatasetItemInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetItemInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatasetItemInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatasetItemInfoResponse setBody(DescribeDatasetItemInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatasetItemInfoResponseBody getBody() {
        return this.body;
    }

}
