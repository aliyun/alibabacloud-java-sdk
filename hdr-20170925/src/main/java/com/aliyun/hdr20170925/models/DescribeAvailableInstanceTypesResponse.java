// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAvailableInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableInstanceTypesResponseBody body;

    public static DescribeAvailableInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableInstanceTypesResponse self = new DescribeAvailableInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableInstanceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableInstanceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableInstanceTypesResponse setBody(DescribeAvailableInstanceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableInstanceTypesResponseBody getBody() {
        return this.body;
    }

}
