// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelNodeListSentinelMachineNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelNodeListSentinelMachineNodesResponseBody body;

    public static SentinelNodeListSentinelMachineNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelNodeListSentinelMachineNodesResponse self = new SentinelNodeListSentinelMachineNodesResponse();
        return TeaModel.build(map, self);
    }

    public SentinelNodeListSentinelMachineNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelNodeListSentinelMachineNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelNodeListSentinelMachineNodesResponse setBody(SentinelNodeListSentinelMachineNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelNodeListSentinelMachineNodesResponseBody getBody() {
        return this.body;
    }

}
