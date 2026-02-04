// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UnbindTotpAuthenticatorRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>UserID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_1asdfghjmnbcxxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UnbindTotpAuthenticatorRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindTotpAuthenticatorRequest self = new UnbindTotpAuthenticatorRequest();
        return TeaModel.build(map, self);
    }

    public UnbindTotpAuthenticatorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindTotpAuthenticatorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
