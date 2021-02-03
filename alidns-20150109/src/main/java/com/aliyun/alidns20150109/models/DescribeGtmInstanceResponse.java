// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmInstanceResponseBody body;

    public static DescribeGtmInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceResponse self = new DescribeGtmInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmInstanceResponse setBody(DescribeGtmInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmInstanceResponseBody getBody() {
        return this.body;
    }

}
