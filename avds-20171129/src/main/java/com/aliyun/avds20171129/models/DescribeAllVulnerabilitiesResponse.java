// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAllVulnerabilitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllVulnerabilitiesResponseBody body;

    public static DescribeAllVulnerabilitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllVulnerabilitiesResponse self = new DescribeAllVulnerabilitiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllVulnerabilitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllVulnerabilitiesResponse setBody(DescribeAllVulnerabilitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllVulnerabilitiesResponseBody getBody() {
        return this.body;
    }

}
