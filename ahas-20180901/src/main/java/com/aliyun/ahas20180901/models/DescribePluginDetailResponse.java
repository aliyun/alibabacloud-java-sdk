// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribePluginDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePluginDetailResponseBody body;

    public static DescribePluginDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginDetailResponse self = new DescribePluginDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginDetailResponse setBody(DescribePluginDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginDetailResponseBody getBody() {
        return this.body;
    }

}
