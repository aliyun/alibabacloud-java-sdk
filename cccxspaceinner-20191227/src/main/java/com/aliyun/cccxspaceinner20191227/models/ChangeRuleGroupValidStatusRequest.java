// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ChangeRuleGroupValidStatusRequest extends TeaModel {
    @NameInMap("RuleGroupId")
    public Long ruleGroupId;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("ServicerId")
    public Long servicerId;

    public static ChangeRuleGroupValidStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeRuleGroupValidStatusRequest self = new ChangeRuleGroupValidStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeRuleGroupValidStatusRequest setRuleGroupId(Long ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

    public ChangeRuleGroupValidStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public ChangeRuleGroupValidStatusRequest setServicerId(Long servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public Long getServicerId() {
        return this.servicerId;
    }

}
