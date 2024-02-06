// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsEipAddressesResponseBody body;

    public static DescribeEnsEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsEipAddressesResponse self = new DescribeEnsEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsEipAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsEipAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsEipAddressesResponse setBody(DescribeEnsEipAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsEipAddressesResponseBody getBody() {
        return this.body;
    }

}
