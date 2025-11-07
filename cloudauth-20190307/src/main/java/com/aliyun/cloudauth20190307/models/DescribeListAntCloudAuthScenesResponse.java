// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListAntCloudAuthScenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeListAntCloudAuthScenesResponseBody body;

    public static DescribeListAntCloudAuthScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListAntCloudAuthScenesResponse self = new DescribeListAntCloudAuthScenesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListAntCloudAuthScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListAntCloudAuthScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListAntCloudAuthScenesResponse setBody(DescribeListAntCloudAuthScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListAntCloudAuthScenesResponseBody getBody() {
        return this.body;
    }

}
