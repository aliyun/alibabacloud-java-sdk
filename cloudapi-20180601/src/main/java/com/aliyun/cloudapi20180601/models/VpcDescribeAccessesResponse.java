// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class VpcDescribeAccessesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VpcDescribeAccessesResponseBody body;

    public static VpcDescribeAccessesResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcDescribeAccessesResponse self = new VpcDescribeAccessesResponse();
        return TeaModel.build(map, self);
    }

    public VpcDescribeAccessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcDescribeAccessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcDescribeAccessesResponse setBody(VpcDescribeAccessesResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcDescribeAccessesResponseBody getBody() {
        return this.body;
    }

}
