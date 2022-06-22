// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterV2AliyunAgwUpdateRuleOffResponseBody body;

    public static SentinelClusterV2AliyunAgwUpdateRuleOffResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOffResponse self = new SentinelClusterV2AliyunAgwUpdateRuleOffResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffResponse setBody(SentinelClusterV2AliyunAgwUpdateRuleOffResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterV2AliyunAgwUpdateRuleOffResponseBody getBody() {
        return this.body;
    }

}
