// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class DescribePartnerConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePartnerConfigResponseBody body;

    public static DescribePartnerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerConfigResponse self = new DescribePartnerConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribePartnerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePartnerConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePartnerConfigResponse setBody(DescribePartnerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePartnerConfigResponseBody getBody() {
        return this.body;
    }

}
