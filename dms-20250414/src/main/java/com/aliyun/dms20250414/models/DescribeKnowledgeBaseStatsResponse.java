// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeBaseStatsResponseBody body;

    public static DescribeKnowledgeBaseStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseStatsResponse self = new DescribeKnowledgeBaseStatsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeBaseStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeBaseStatsResponse setBody(DescribeKnowledgeBaseStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeBaseStatsResponseBody getBody() {
        return this.body;
    }

}
