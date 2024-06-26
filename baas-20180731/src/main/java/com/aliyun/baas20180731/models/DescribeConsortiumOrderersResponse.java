// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumOrderersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumOrderersResponseBody body;

    public static DescribeConsortiumOrderersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumOrderersResponse self = new DescribeConsortiumOrderersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumOrderersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumOrderersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumOrderersResponse setBody(DescribeConsortiumOrderersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumOrderersResponseBody getBody() {
        return this.body;
    }

}
