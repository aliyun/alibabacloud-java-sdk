// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopMetadataResponseBody body;

    public static DescribeDesktopMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopMetadataResponse self = new DescribeDesktopMetadataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopMetadataResponse setBody(DescribeDesktopMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopMetadataResponseBody getBody() {
        return this.body;
    }

}
