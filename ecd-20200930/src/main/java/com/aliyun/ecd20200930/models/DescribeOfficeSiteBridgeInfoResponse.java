// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSiteBridgeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOfficeSiteBridgeInfoResponseBody body;

    public static DescribeOfficeSiteBridgeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSiteBridgeInfoResponse self = new DescribeOfficeSiteBridgeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSiteBridgeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOfficeSiteBridgeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOfficeSiteBridgeInfoResponse setBody(DescribeOfficeSiteBridgeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOfficeSiteBridgeInfoResponseBody getBody() {
        return this.body;
    }

}
