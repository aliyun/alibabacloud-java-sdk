// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceVSwitchListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessInstanceVSwitchListResponseBody body;

    public static DescribeAccessInstanceVSwitchListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceVSwitchListResponse self = new DescribeAccessInstanceVSwitchListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceVSwitchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessInstanceVSwitchListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessInstanceVSwitchListResponse setBody(DescribeAccessInstanceVSwitchListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessInstanceVSwitchListResponseBody getBody() {
        return this.body;
    }

}
