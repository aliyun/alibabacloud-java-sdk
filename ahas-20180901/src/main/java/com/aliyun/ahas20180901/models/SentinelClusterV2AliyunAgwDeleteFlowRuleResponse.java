// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwDeleteFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterV2AliyunAgwDeleteFlowRuleResponseBody body;

    public static SentinelClusterV2AliyunAgwDeleteFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwDeleteFlowRuleResponse self = new SentinelClusterV2AliyunAgwDeleteFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwDeleteFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterV2AliyunAgwDeleteFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterV2AliyunAgwDeleteFlowRuleResponse setBody(SentinelClusterV2AliyunAgwDeleteFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterV2AliyunAgwDeleteFlowRuleResponseBody getBody() {
        return this.body;
    }

}
