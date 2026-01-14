// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAgentGroupResponseBody body;

    public static AddAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAgentGroupResponse self = new AddAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAgentGroupResponse setBody(AddAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAgentGroupResponseBody getBody() {
        return this.body;
    }

}
