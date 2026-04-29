// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudUnassignAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudUnassignAgentGroupResponseBody body;

    public static CloudUnassignAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudUnassignAgentGroupResponse self = new CloudUnassignAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloudUnassignAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudUnassignAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudUnassignAgentGroupResponse setBody(CloudUnassignAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudUnassignAgentGroupResponseBody getBody() {
        return this.body;
    }

}
