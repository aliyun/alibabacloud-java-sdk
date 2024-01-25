// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDatasetListResponseBody body;

    public static DescribeDatasetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetListResponse self = new DescribeDatasetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatasetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatasetListResponse setBody(DescribeDatasetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatasetListResponseBody getBody() {
        return this.body;
    }

}
