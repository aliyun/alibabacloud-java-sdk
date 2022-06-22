// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwGetAssignListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterV2AliyunAgwGetAssignListResponseBody body;

    public static SentinelClusterV2AliyunAgwGetAssignListResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwGetAssignListResponse self = new SentinelClusterV2AliyunAgwGetAssignListResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponse setBody(SentinelClusterV2AliyunAgwGetAssignListResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterV2AliyunAgwGetAssignListResponseBody getBody() {
        return this.body;
    }

}
