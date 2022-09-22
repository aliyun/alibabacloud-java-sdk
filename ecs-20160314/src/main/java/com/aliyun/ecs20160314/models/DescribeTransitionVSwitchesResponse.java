// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeTransitionVSwitchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTransitionVSwitchesResponseBody body;

    public static DescribeTransitionVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitionVSwitchesResponse self = new DescribeTransitionVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitionVSwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitionVSwitchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitionVSwitchesResponse setBody(DescribeTransitionVSwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitionVSwitchesResponseBody getBody() {
        return this.body;
    }

}
