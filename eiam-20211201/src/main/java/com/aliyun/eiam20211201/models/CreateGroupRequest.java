// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>组描述，长度最大限制128。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>组外部ID，长度最大限制64，如果不填，则默认使用groupId填充。</p>
     */
    @NameInMap("GroupExternalId")
    public String groupExternalId;

    /**
     * <p>组名称，长度最大限制64。</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupRequest setGroupExternalId(String groupExternalId) {
        this.groupExternalId = groupExternalId;
        return this;
    }
    public String getGroupExternalId() {
        return this.groupExternalId;
    }

    public CreateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
