// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSpacesResponseBody body;

    public static DescribeSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpacesResponse self = new DescribeSpacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSpacesResponse setBody(DescribeSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpacesResponseBody getBody() {
        return this.body;
    }

}
