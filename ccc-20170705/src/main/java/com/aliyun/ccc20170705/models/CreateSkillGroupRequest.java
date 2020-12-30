// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateSkillGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    @NameInMap("AllowPrivateOutboundNumber")
    public Boolean allowPrivateOutboundNumber;

    @NameInMap("OutboundPhoneNumberId")
    public java.util.List<String> outboundPhoneNumberId;

    @NameInMap("UserId")
    public java.util.List<String> userId;

    @NameInMap("SkillLevel")
    public java.util.List<Integer> skillLevel;

    public static CreateSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillGroupRequest self = new CreateSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSkillGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSkillGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillGroupRequest setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
        return this;
    }
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    public CreateSkillGroupRequest setAllowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
        this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
        return this;
    }
    public Boolean getAllowPrivateOutboundNumber() {
        return this.allowPrivateOutboundNumber;
    }

    public CreateSkillGroupRequest setOutboundPhoneNumberId(java.util.List<String> outboundPhoneNumberId) {
        this.outboundPhoneNumberId = outboundPhoneNumberId;
        return this;
    }
    public java.util.List<String> getOutboundPhoneNumberId() {
        return this.outboundPhoneNumberId;
    }

    public CreateSkillGroupRequest setUserId(java.util.List<String> userId) {
        this.userId = userId;
        return this;
    }
    public java.util.List<String> getUserId() {
        return this.userId;
    }

    public CreateSkillGroupRequest setSkillLevel(java.util.List<Integer> skillLevel) {
        this.skillLevel = skillLevel;
        return this;
    }
    public java.util.List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

}
