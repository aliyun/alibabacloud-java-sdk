// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAssignedAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListAssignedAgentGroupResponseBody body;

    public static CloudListAssignedAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListAssignedAgentGroupResponse self = new CloudListAssignedAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloudListAssignedAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListAssignedAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListAssignedAgentGroupResponse setBody(CloudListAssignedAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListAssignedAgentGroupResponseBody getBody() {
        return this.body;
    }

}
