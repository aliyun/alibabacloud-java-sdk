// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPhoneNumberRequest extends TeaModel {
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumberId")
    public String phoneNumberId;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    @NameInMap("Usage")
    public String usage;

    public static ModifyPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneNumberRequest self = new ModifyPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneNumberRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public ModifyPhoneNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPhoneNumberRequest setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public ModifyPhoneNumberRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public ModifyPhoneNumberRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
