// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeStoragePackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStoragePackagesResponseBody body;

    public static DescribeStoragePackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePackagesResponse self = new DescribeStoragePackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoragePackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStoragePackagesResponse setBody(DescribeStoragePackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoragePackagesResponseBody getBody() {
        return this.body;
    }

}
