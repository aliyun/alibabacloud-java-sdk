// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsSaleControlAvailableResourceResponseBody body;

    public static DescribeEnsSaleControlAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlAvailableResourceResponse self = new DescribeEnsSaleControlAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlAvailableResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsSaleControlAvailableResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsSaleControlAvailableResourceResponse setBody(DescribeEnsSaleControlAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsSaleControlAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
