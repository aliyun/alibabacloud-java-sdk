// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class JoinSecurityGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static JoinSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinSecurityGroupResponse self = new JoinSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

}
