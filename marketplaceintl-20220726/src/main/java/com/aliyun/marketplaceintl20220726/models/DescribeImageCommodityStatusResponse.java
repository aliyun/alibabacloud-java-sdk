// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeImageCommodityStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageCommodityStatusResponseBody body;

    public static DescribeImageCommodityStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCommodityStatusResponse self = new DescribeImageCommodityStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageCommodityStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageCommodityStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageCommodityStatusResponse setBody(DescribeImageCommodityStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageCommodityStatusResponseBody getBody() {
        return this.body;
    }

}
