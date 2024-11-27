// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAbacAuthorizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <strong>example:</strong>
     * <p>31****</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <strong>example:</strong>
     * <p>51****</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static CreateAbacAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAbacAuthorizationRequest self = new CreateAbacAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAbacAuthorizationRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public CreateAbacAuthorizationRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreateAbacAuthorizationRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public CreateAbacAuthorizationRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateAbacAuthorizationRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
