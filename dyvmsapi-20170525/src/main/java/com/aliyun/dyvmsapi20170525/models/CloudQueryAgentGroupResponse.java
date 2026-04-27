// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryAgentGroupResponseBody body;

    public static CloudQueryAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryAgentGroupResponse self = new CloudQueryAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryAgentGroupResponse setBody(CloudQueryAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryAgentGroupResponseBody getBody() {
        return this.body;
    }

}
