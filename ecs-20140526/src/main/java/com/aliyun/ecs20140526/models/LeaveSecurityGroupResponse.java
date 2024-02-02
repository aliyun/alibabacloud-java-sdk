// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LeaveSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LeaveSecurityGroupResponseBody body;

    public static LeaveSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        LeaveSecurityGroupResponse self = new LeaveSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public LeaveSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LeaveSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LeaveSecurityGroupResponse setBody(LeaveSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public LeaveSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
