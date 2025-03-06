// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsByGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginsByGroupResponseBody body;

    public static DescribePluginsByGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsByGroupResponse self = new DescribePluginsByGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginsByGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginsByGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginsByGroupResponse setBody(DescribePluginsByGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginsByGroupResponseBody getBody() {
        return this.body;
    }

}
