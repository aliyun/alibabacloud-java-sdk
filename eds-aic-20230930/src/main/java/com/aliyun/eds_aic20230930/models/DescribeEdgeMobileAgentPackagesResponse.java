// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeEdgeMobileAgentPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEdgeMobileAgentPackagesResponseBody body;

    public static DescribeEdgeMobileAgentPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMobileAgentPackagesResponse self = new DescribeEdgeMobileAgentPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMobileAgentPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeMobileAgentPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdgeMobileAgentPackagesResponse setBody(DescribeEdgeMobileAgentPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeMobileAgentPackagesResponseBody getBody() {
        return this.body;
    }

}
