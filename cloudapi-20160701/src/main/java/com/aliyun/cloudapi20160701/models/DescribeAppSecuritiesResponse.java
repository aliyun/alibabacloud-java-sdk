// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeAppSecuritiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppSecuritiesResponseBody body;

    public static DescribeAppSecuritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecuritiesResponse self = new DescribeAppSecuritiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecuritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppSecuritiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppSecuritiesResponse setBody(DescribeAppSecuritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppSecuritiesResponseBody getBody() {
        return this.body;
    }

}
