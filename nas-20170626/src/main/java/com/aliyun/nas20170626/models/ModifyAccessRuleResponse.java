// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessRuleResponse self = new ModifyAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
