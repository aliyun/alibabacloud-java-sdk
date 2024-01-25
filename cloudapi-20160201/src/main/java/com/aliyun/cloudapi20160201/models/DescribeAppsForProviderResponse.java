// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAppsForProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppsForProviderResponseBody body;

    public static DescribeAppsForProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsForProviderResponse self = new DescribeAppsForProviderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppsForProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppsForProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppsForProviderResponse setBody(DescribeAppsForProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppsForProviderResponseBody getBody() {
        return this.body;
    }

}
