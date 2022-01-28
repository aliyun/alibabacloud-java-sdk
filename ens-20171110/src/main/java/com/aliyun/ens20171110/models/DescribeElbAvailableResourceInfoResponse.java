// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeElbAvailableResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeElbAvailableResourceInfoResponseBody body;

    public static DescribeElbAvailableResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElbAvailableResourceInfoResponse self = new DescribeElbAvailableResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElbAvailableResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElbAvailableResourceInfoResponse setBody(DescribeElbAvailableResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElbAvailableResourceInfoResponseBody getBody() {
        return this.body;
    }

}
