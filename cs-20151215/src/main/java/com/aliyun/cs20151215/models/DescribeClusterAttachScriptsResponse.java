// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public String body;

    public static DescribeClusterAttachScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttachScriptsResponse self = new DescribeClusterAttachScriptsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAttachScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterAttachScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterAttachScriptsResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
