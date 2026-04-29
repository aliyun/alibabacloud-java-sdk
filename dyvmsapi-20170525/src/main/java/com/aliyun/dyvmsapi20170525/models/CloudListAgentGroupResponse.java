// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListAgentGroupResponseBody body;

    public static CloudListAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListAgentGroupResponse self = new CloudListAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloudListAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListAgentGroupResponse setBody(CloudListAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListAgentGroupResponseBody getBody() {
        return this.body;
    }

}
