// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountAttributesResponseBody body;

    public static DescribeAccountAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesResponse self = new DescribeAccountAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountAttributesResponse setBody(DescribeAccountAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountAttributesResponseBody getBody() {
        return this.body;
    }

}
