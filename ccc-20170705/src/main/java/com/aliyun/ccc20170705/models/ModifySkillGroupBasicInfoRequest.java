// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySkillGroupBasicInfoRequest extends TeaModel {
    @NameInMap("AllowPrivateOutboundNumber")
    public Boolean allowPrivateOutboundNumber;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static ModifySkillGroupBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupBasicInfoRequest self = new ModifySkillGroupBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupBasicInfoRequest setAllowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
        this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
        return this;
    }
    public Boolean getAllowPrivateOutboundNumber() {
        return this.allowPrivateOutboundNumber;
    }

    public ModifySkillGroupBasicInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySkillGroupBasicInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySkillGroupBasicInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySkillGroupBasicInfoRequest setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
        return this;
    }
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    public ModifySkillGroupBasicInfoRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
