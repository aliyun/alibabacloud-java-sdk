// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceSystemCnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmInstanceSystemCnameResponseBody body;

    public static DescribeGtmInstanceSystemCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceSystemCnameResponse self = new DescribeGtmInstanceSystemCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceSystemCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmInstanceSystemCnameResponse setBody(DescribeGtmInstanceSystemCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmInstanceSystemCnameResponseBody getBody() {
        return this.body;
    }

}
