// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopTypesResponseBody body;

    public static DescribeDesktopTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopTypesResponse self = new DescribeDesktopTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopTypesResponse setBody(DescribeDesktopTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopTypesResponseBody getBody() {
        return this.body;
    }

}
