// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayQosListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayQosListResponseBody body;

    public static DescribePlayQosListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQosListResponse self = new DescribePlayQosListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayQosListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayQosListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayQosListResponse setBody(DescribePlayQosListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayQosListResponseBody getBody() {
        return this.body;
    }

}
