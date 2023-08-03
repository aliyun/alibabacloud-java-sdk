// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupQpsResponseBody body;

    public static DescribeGroupQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupQpsResponse self = new DescribeGroupQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupQpsResponse setBody(DescribeGroupQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupQpsResponseBody getBody() {
        return this.body;
    }

}
