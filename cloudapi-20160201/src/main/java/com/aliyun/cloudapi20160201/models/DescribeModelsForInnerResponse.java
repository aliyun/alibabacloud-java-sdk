// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeModelsForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModelsForInnerResponseBody body;

    public static DescribeModelsForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelsForInnerResponse self = new DescribeModelsForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelsForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelsForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelsForInnerResponse setBody(DescribeModelsForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelsForInnerResponseBody getBody() {
        return this.body;
    }

}
