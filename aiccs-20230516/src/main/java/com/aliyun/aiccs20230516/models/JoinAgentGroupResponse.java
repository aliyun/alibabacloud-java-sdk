// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class JoinAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinAgentGroupResponseBody body;

    public static JoinAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinAgentGroupResponse self = new JoinAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public JoinAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinAgentGroupResponse setBody(JoinAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinAgentGroupResponseBody getBody() {
        return this.body;
    }

}
