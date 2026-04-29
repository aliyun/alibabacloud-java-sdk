// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAssignAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudAssignAgentGroupResponseBody body;

    public static CloudAssignAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudAssignAgentGroupResponse self = new CloudAssignAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloudAssignAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudAssignAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudAssignAgentGroupResponse setBody(CloudAssignAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudAssignAgentGroupResponseBody getBody() {
        return this.body;
    }

}
