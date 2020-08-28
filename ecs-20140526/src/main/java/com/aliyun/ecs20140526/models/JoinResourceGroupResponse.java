// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class JoinResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static JoinResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupResponse self = new JoinResourceGroupResponse();
        return TeaModel.build(map, self);
    }

}
