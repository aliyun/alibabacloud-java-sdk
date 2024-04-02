// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteIndexPageBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteIndexPageBaselineResponseBody body;

    public static DescribeWebsiteIndexPageBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteIndexPageBaselineResponse self = new DescribeWebsiteIndexPageBaselineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteIndexPageBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteIndexPageBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteIndexPageBaselineResponse setBody(DescribeWebsiteIndexPageBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteIndexPageBaselineResponseBody getBody() {
        return this.body;
    }

}
