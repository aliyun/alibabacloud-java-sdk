// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class LeaveSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public LeaveSecurityGroupResponse setBody(LeaveSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public LeaveSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
