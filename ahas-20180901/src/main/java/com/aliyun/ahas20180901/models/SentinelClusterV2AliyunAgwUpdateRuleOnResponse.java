// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterV2AliyunAgwUpdateRuleOnResponseBody body;

    public static SentinelClusterV2AliyunAgwUpdateRuleOnResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOnResponse self = new SentinelClusterV2AliyunAgwUpdateRuleOnResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnResponse setBody(SentinelClusterV2AliyunAgwUpdateRuleOnResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterV2AliyunAgwUpdateRuleOnResponseBody getBody() {
        return this.body;
    }

}
