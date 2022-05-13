// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDesktopIdsByVulNamesResponseBody body;

    public static DescribeDesktopIdsByVulNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopIdsByVulNamesResponse self = new DescribeDesktopIdsByVulNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopIdsByVulNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopIdsByVulNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopIdsByVulNamesResponse setBody(DescribeDesktopIdsByVulNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopIdsByVulNamesResponseBody getBody() {
        return this.body;
    }

}
