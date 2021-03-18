// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupReferencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityGroupReferencesResponseBody body;

    public static DescribeSecurityGroupReferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupReferencesResponse self = new DescribeSecurityGroupReferencesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupReferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityGroupReferencesResponse setBody(DescribeSecurityGroupReferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityGroupReferencesResponseBody getBody() {
        return this.body;
    }

}
