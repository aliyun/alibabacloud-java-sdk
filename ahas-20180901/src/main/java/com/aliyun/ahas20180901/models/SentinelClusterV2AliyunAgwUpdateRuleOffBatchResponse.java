// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponseBody body;

    public static SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponse self = new SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponse setBody(SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterV2AliyunAgwUpdateRuleOffBatchResponseBody getBody() {
        return this.body;
    }

}
