// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStorageResponseBody body;

    public static DescribeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageResponse self = new DescribeStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageResponse setBody(DescribeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageResponseBody getBody() {
        return this.body;
    }

}
