// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmInstanceAddressPoolsResponseBody body;

    public static DescribeGtmInstanceAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolsResponse self = new DescribeGtmInstanceAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmInstanceAddressPoolsResponse setBody(DescribeGtmInstanceAddressPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmInstanceAddressPoolsResponseBody getBody() {
        return this.body;
    }

}
