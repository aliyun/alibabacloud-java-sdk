// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableUserRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DisableUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableUserRequest self = new DisableUserRequest();
        return TeaModel.build(map, self);
    }

    public DisableUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
