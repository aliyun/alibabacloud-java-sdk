// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneByEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertSceneByEventResponseBody body;

    public static DescribeAlertSceneByEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSceneByEventResponse self = new DescribeAlertSceneByEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSceneByEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertSceneByEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertSceneByEventResponse setBody(DescribeAlertSceneByEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertSceneByEventResponseBody getBody() {
        return this.body;
    }

}
