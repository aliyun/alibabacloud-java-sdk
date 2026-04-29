// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateAgentGroupResponseBody body;

    public static CloudCreateAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAgentGroupResponse self = new CloudCreateAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateAgentGroupResponse setBody(CloudCreateAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateAgentGroupResponseBody getBody() {
        return this.body;
    }

}
