// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAvailableVipsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableVipsResponseBody body;

    public static DescribeAvailableVipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableVipsResponse self = new DescribeAvailableVipsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableVipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableVipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableVipsResponse setBody(DescribeAvailableVipsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableVipsResponseBody getBody() {
        return this.body;
    }

}
