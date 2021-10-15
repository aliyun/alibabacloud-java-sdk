// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeClientPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClientPackageResponseBody body;

    public static DescribeClientPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientPackageResponse self = new DescribeClientPackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientPackageResponse setBody(DescribeClientPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientPackageResponseBody getBody() {
        return this.body;
    }

}
