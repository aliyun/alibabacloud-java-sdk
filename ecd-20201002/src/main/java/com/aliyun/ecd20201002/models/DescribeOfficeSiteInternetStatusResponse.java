// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeOfficeSiteInternetStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOfficeSiteInternetStatusResponseBody body;

    public static DescribeOfficeSiteInternetStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSiteInternetStatusResponse self = new DescribeOfficeSiteInternetStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSiteInternetStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOfficeSiteInternetStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOfficeSiteInternetStatusResponse setBody(DescribeOfficeSiteInternetStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOfficeSiteInternetStatusResponseBody getBody() {
        return this.body;
    }

}
