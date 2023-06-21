// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserDescriptionRequest extends TeaModel {
    /**
     * <p>The description of the account. The value can be up to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the account.</p>
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
