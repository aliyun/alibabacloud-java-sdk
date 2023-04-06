// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserDescriptionRequest extends TeaModel {
    /**
     * <p>账户描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>账户ID</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UpdateUserDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDescriptionRequest self = new UpdateUserDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateUserDescriptionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
