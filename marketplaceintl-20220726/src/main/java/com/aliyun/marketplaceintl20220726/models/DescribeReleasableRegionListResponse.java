// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeReleasableRegionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReleasableRegionListResponseBody body;

    public static DescribeReleasableRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReleasableRegionListResponse self = new DescribeReleasableRegionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReleasableRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReleasableRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReleasableRegionListResponse setBody(DescribeReleasableRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReleasableRegionListResponseBody getBody() {
        return this.body;
    }

}
