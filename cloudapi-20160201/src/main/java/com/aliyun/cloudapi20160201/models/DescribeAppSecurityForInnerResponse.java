// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAppSecurityForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppSecurityForInnerResponseBody body;

    public static DescribeAppSecurityForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecurityForInnerResponse self = new DescribeAppSecurityForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecurityForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppSecurityForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppSecurityForInnerResponse setBody(DescribeAppSecurityForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppSecurityForInnerResponseBody getBody() {
        return this.body;
    }

}
