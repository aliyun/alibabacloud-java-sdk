// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmInstanceAddressPoolResponseBody body;

    public static DescribeGtmInstanceAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolResponse self = new DescribeGtmInstanceAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmInstanceAddressPoolResponse setBody(DescribeGtmInstanceAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmInstanceAddressPoolResponseBody getBody() {
        return this.body;
    }

}
