// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDatasetInfoResponseBody body;

    public static DescribeDatasetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetInfoResponse self = new DescribeDatasetInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatasetInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatasetInfoResponse setBody(DescribeDatasetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatasetInfoResponseBody getBody() {
        return this.body;
    }

}
