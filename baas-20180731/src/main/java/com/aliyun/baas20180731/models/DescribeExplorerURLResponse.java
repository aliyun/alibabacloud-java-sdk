// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeExplorerURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExplorerURLResponseBody body;

    public static DescribeExplorerURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExplorerURLResponse self = new DescribeExplorerURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExplorerURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExplorerURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExplorerURLResponse setBody(DescribeExplorerURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExplorerURLResponseBody getBody() {
        return this.body;
    }

}
