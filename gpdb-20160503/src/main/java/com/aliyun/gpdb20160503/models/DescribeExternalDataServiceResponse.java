// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeExternalDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExternalDataServiceResponseBody body;

    public static DescribeExternalDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExternalDataServiceResponse self = new DescribeExternalDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExternalDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExternalDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExternalDataServiceResponse setBody(DescribeExternalDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExternalDataServiceResponseBody getBody() {
        return this.body;
    }

}
