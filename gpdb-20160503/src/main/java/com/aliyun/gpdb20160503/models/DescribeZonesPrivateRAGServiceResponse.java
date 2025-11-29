// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeZonesPrivateRAGServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeZonesPrivateRAGServiceResponseBody body;

    public static DescribeZonesPrivateRAGServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesPrivateRAGServiceResponse self = new DescribeZonesPrivateRAGServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZonesPrivateRAGServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeZonesPrivateRAGServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeZonesPrivateRAGServiceResponse setBody(DescribeZonesPrivateRAGServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZonesPrivateRAGServiceResponseBody getBody() {
        return this.body;
    }

}
