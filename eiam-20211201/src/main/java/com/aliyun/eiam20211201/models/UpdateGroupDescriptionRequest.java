// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateGroupDescriptionRequest extends TeaModel {
    /**
     * <p>The description of the account group.</p>
     * 
     * <strong>example:</strong>
     * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateGroupDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDescriptionRequest self = new UpdateGroupDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGroupDescriptionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
