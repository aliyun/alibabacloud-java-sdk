// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateInstanceDescriptionRequest extends TeaModel {
    /**
     * <p>The new description of the instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance whose description you want to modify.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceDescriptionRequest self = new UpdateInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateInstanceDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
