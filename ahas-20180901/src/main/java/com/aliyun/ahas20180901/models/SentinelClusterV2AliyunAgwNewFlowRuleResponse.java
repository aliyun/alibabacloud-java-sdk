// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwNewFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBody body;

    public static SentinelClusterV2AliyunAgwNewFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwNewFlowRuleResponse self = new SentinelClusterV2AliyunAgwNewFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponse setBody(SentinelClusterV2AliyunAgwNewFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBody getBody() {
        return this.body;
    }

}
