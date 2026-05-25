// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeStageModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStageModelsResponseBody body;

    public static DescribeStageModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStageModelsResponse self = new DescribeStageModelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStageModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStageModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStageModelsResponse setBody(DescribeStageModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStageModelsResponseBody getBody() {
        return this.body;
    }

}
