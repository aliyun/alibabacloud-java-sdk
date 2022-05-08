// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppAttributesResponseBody body;

    public static DescribeAppAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAttributesResponse self = new DescribeAppAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppAttributesResponse setBody(DescribeAppAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppAttributesResponseBody getBody() {
        return this.body;
    }

}
