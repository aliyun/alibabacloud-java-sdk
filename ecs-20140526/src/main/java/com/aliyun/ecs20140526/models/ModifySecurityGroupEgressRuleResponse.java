// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupEgressRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifySecurityGroupEgressRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupEgressRuleResponse self = new ModifySecurityGroupEgressRuleResponse();
        return TeaModel.build(map, self);
    }

}
