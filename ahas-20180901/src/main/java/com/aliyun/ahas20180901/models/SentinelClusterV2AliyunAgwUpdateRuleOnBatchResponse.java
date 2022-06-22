// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody body;

    public static SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponse self = new SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponse setBody(SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody getBody() {
        return this.body;
    }

}
