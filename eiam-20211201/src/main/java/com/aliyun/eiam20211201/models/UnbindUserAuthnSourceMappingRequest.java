// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UnbindUserAuthnSourceMappingRequest extends TeaModel {
    /**
     * <p>来源ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

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
     * <p>外部关联ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("UserExternalId")
    public String userExternalId;

    /**
     * <p>用户ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_ue2jvisn35exxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UnbindUserAuthnSourceMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserAuthnSourceMappingRequest self = new UnbindUserAuthnSourceMappingRequest();
        return TeaModel.build(map, self);
    }

    public UnbindUserAuthnSourceMappingRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public UnbindUserAuthnSourceMappingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindUserAuthnSourceMappingRequest setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

    public UnbindUserAuthnSourceMappingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
