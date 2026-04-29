// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteAgentGroupResponseBody body;

    public static CloudDeleteAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteAgentGroupResponse self = new CloudDeleteAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteAgentGroupResponse setBody(CloudDeleteAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteAgentGroupResponseBody getBody() {
        return this.body;
    }

}
