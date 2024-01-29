// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeGtmInstanceAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmInstanceAddressPoolResponse setBody(DescribeGtmInstanceAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmInstanceAddressPoolResponseBody getBody() {
        return this.body;
    }

}
