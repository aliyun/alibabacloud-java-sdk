// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateGroupDescriptionRequest extends TeaModel {
    /**
     * <p>组描述，长度最大限制128。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>组ID，长度最大限制64。</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
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
