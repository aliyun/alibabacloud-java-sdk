// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrgByLayerResponseBody body;

    public static DescribeOrgByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgByLayerResponse self = new DescribeOrgByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrgByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrgByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrgByLayerResponse setBody(DescribeOrgByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrgByLayerResponseBody getBody() {
        return this.body;
    }

}
