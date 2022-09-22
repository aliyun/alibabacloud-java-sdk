// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAccountQuotaAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountQuotaAttributesResponseBody body;

    public static DescribeAccountQuotaAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountQuotaAttributesResponse self = new DescribeAccountQuotaAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountQuotaAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountQuotaAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountQuotaAttributesResponse setBody(DescribeAccountQuotaAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountQuotaAttributesResponseBody getBody() {
        return this.body;
    }

}
