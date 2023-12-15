// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class IntentCreateDTO extends TeaModel {
    @NameInMap("IntentId")
    public Long intentId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RuleCheck")
    public java.util.List<RuleMtopDTO> ruleCheck;

    @NameInMap("Slot")
    public java.util.List<SlotrecordMtopDTO> slot;

    @NameInMap("UserSay")
    public java.util.List<UsersayMtopDTO> userSay;

    public static IntentCreateDTO build(java.util.Map<String, ?> map) throws Exception {
        IntentCreateDTO self = new IntentCreateDTO();
        return TeaModel.build(map, self);
    }

    public IntentCreateDTO setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public IntentCreateDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IntentCreateDTO setRuleCheck(java.util.List<RuleMtopDTO> ruleCheck) {
        this.ruleCheck = ruleCheck;
        return this;
    }
    public java.util.List<RuleMtopDTO> getRuleCheck() {
        return this.ruleCheck;
    }

    public IntentCreateDTO setSlot(java.util.List<SlotrecordMtopDTO> slot) {
        this.slot = slot;
        return this;
    }
    public java.util.List<SlotrecordMtopDTO> getSlot() {
        return this.slot;
    }

    public IntentCreateDTO setUserSay(java.util.List<UsersayMtopDTO> userSay) {
        this.userSay = userSay;
        return this;
    }
    public java.util.List<UsersayMtopDTO> getUserSay() {
        return this.userSay;
    }

}
