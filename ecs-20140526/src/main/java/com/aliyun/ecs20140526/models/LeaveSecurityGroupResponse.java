// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LeaveSecurityGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static LeaveSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        LeaveSecurityGroupResponse self = new LeaveSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public LeaveSecurityGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
