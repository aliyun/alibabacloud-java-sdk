// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DescribeXsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeXsInstanceResponseBody body;

    public static DescribeXsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeXsInstanceResponse self = new DescribeXsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeXsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeXsInstanceResponse setBody(DescribeXsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeXsInstanceResponseBody getBody() {
        return this.body;
    }

}
