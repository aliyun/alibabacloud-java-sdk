// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinSecurityGroupResponseBody body;

    public static JoinSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinSecurityGroupResponse self = new JoinSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public JoinSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinSecurityGroupResponse setBody(JoinSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
