// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateInstanceDescriptionRequest extends TeaModel {
    /**
     * <p>实例的描述信息</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM的实例id</p>
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
