// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudBatchCreateAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudBatchCreateAgentResponseBody body;

    public static CloudBatchCreateAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudBatchCreateAgentResponse self = new CloudBatchCreateAgentResponse();
        return TeaModel.build(map, self);
    }

    public CloudBatchCreateAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudBatchCreateAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudBatchCreateAgentResponse setBody(CloudBatchCreateAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudBatchCreateAgentResponseBody getBody() {
        return this.body;
    }

}
