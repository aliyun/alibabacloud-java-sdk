// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubaccountK8sClusterUserConfigResponseBody body;

    public static DescribeSubaccountK8sClusterUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubaccountK8sClusterUserConfigResponse self = new DescribeSubaccountK8sClusterUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubaccountK8sClusterUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubaccountK8sClusterUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubaccountK8sClusterUserConfigResponse setBody(DescribeSubaccountK8sClusterUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubaccountK8sClusterUserConfigResponseBody getBody() {
        return this.body;
    }

}
