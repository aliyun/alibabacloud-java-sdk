// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
    /**
     * <p>The external ID of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("GroupExternalId")
    public String groupExternalId;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>name_test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setGroupExternalId(String groupExternalId) {
        this.groupExternalId = groupExternalId;
        return this;
    }
    public String getGroupExternalId() {
        return this.groupExternalId;
    }

    public UpdateGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
