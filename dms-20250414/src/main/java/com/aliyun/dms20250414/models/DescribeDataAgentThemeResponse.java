// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentThemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataAgentThemeResponseBody body;

    public static DescribeDataAgentThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentThemeResponse self = new DescribeDataAgentThemeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataAgentThemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataAgentThemeResponse setBody(DescribeDataAgentThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataAgentThemeResponseBody getBody() {
        return this.body;
    }

}
