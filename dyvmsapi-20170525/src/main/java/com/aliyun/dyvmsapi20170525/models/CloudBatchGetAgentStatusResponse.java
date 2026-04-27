// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudBatchGetAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudBatchGetAgentStatusResponseBody body;

    public static CloudBatchGetAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudBatchGetAgentStatusResponse self = new CloudBatchGetAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public CloudBatchGetAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudBatchGetAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudBatchGetAgentStatusResponse setBody(CloudBatchGetAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudBatchGetAgentStatusResponseBody getBody() {
        return this.body;
    }

}
