// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOfficeSitesResponseBody body;

    public static DescribeOfficeSitesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSitesResponse self = new DescribeOfficeSitesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSitesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOfficeSitesResponse setBody(DescribeOfficeSitesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOfficeSitesResponseBody getBody() {
        return this.body;
    }

}
