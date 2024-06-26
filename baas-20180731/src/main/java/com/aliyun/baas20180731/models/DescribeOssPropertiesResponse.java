// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOssPropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssPropertiesResponseBody body;

    public static DescribeOssPropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssPropertiesResponse self = new DescribeOssPropertiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssPropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssPropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssPropertiesResponse setBody(DescribeOssPropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssPropertiesResponseBody getBody() {
        return this.body;
    }

}
