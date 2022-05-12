// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeUserBandWidthDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserBandWidthDataResponseBody body;

    public static DescribeUserBandWidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBandWidthDataResponse self = new DescribeUserBandWidthDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBandWidthDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserBandWidthDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserBandWidthDataResponse setBody(DescribeUserBandWidthDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBandWidthDataResponseBody getBody() {
        return this.body;
    }

}
