// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNCInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNCInformationResponseBody body;

    public static DescribeNCInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNCInformationResponse self = new DescribeNCInformationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNCInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNCInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNCInformationResponse setBody(DescribeNCInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNCInformationResponseBody getBody() {
        return this.body;
    }

}
