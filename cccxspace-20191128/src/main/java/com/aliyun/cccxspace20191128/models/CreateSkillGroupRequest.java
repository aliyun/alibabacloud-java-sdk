// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateSkillGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupName")
    public String skillGroupName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("ChannelType")
    public Integer channelType;

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

    public CreateSkillGroupRequest setSkillGroupName(String skillGroupName) {
        this.skillGroupName = skillGroupName;
        return this;
    }
    public String getSkillGroupName() {
        return this.skillGroupName;
    }

    public CreateSkillGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillGroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateSkillGroupRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

}
