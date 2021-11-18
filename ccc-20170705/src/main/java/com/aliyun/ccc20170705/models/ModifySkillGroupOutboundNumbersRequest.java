// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySkillGroupOutboundNumbersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperationType")
    public Integer operationType;

    @NameInMap("OutboundPhoneNumberId")
    public java.util.List<String> outboundPhoneNumberId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static ModifySkillGroupOutboundNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupOutboundNumbersRequest self = new ModifySkillGroupOutboundNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupOutboundNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySkillGroupOutboundNumbersRequest setOperationType(Integer operationType) {
        this.operationType = operationType;
        return this;
    }
    public Integer getOperationType() {
        return this.operationType;
    }

    public ModifySkillGroupOutboundNumbersRequest setOutboundPhoneNumberId(java.util.List<String> outboundPhoneNumberId) {
        this.outboundPhoneNumberId = outboundPhoneNumberId;
        return this;
    }
    public java.util.List<String> getOutboundPhoneNumberId() {
        return this.outboundPhoneNumberId;
    }

    public ModifySkillGroupOutboundNumbersRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
