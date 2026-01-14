// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentGroupPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentGroupPageResponseBody body;

    public static AgentGroupPageResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentGroupPageResponse self = new AgentGroupPageResponse();
        return TeaModel.build(map, self);
    }

    public AgentGroupPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgentGroupPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgentGroupPageResponse setBody(AgentGroupPageResponseBody body) {
        this.body = body;
        return this;
    }
    public AgentGroupPageResponseBody getBody() {
        return this.body;
    }

}
