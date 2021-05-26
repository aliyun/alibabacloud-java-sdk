// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class DeleteChatDispatchRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public Integer ruleId;

    public static DeleteChatDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatDispatchRuleRequest self = new DeleteChatDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChatDispatchRuleRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

}
