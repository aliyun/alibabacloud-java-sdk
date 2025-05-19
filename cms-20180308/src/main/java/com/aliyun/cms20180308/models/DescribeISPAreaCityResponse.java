// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeISPAreaCityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeISPAreaCityResponseBody body;

    public static DescribeISPAreaCityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeISPAreaCityResponse self = new DescribeISPAreaCityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeISPAreaCityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeISPAreaCityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeISPAreaCityResponse setBody(DescribeISPAreaCityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeISPAreaCityResponseBody getBody() {
        return this.body;
    }

}
