// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateGroupDescriptionRequest extends TeaModel {
    /**
     * <p>The description of the account group. The value can be up to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
