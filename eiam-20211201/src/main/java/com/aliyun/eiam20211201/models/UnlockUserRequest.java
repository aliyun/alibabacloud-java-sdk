// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UnlockUserRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The account ID.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UnlockUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnlockUserRequest self = new UnlockUserRequest();
        return TeaModel.build(map, self);
    }

    public UnlockUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnlockUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
