// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertSceneResponseBody body;

    public static DescribeAlertSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSceneResponse self = new DescribeAlertSceneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertSceneResponse setBody(DescribeAlertSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertSceneResponseBody getBody() {
        return this.body;
    }

}
