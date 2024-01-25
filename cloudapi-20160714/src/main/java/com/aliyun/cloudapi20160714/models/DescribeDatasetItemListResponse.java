// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDatasetItemListResponseBody body;

    public static DescribeDatasetItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetItemListResponse self = new DescribeDatasetItemListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatasetItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatasetItemListResponse setBody(DescribeDatasetItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatasetItemListResponseBody getBody() {
        return this.body;
    }

}
