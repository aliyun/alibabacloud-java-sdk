// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteWebAuthnAuthenticatorRequest extends TeaModel {
    /**
     * <p>认证器ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>authn_h4x5etphqdasydr67lxxxxx</p>
     */
    @NameInMap("AuthenticatorId")
    public String authenticatorId;

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
     * <p>user_53eh54zdr6iazeijyep5wcxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteWebAuthnAuthenticatorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebAuthnAuthenticatorRequest self = new DeleteWebAuthnAuthenticatorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebAuthnAuthenticatorRequest setAuthenticatorId(String authenticatorId) {
        this.authenticatorId = authenticatorId;
        return this;
    }
    public String getAuthenticatorId() {
        return this.authenticatorId;
    }

    public DeleteWebAuthnAuthenticatorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteWebAuthnAuthenticatorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
