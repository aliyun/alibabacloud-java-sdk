// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAbacAuthorizationRequest extends TeaModel {
    /**
     * <p>Principal Type. Valid values:<strong>user</strong>or<strong>custom role</strong>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>USER</li>
     * <li>ROLE</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The ID of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The ID of the role.</p>
     * <blockquote>
     * <p>If IdentityType is set to ROLE, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>31****</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the user. You can call the <a href="https://help.aliyun.com/document_detail/465816.html">GetUser</a> operation to query the user ID.</p>
     * <blockquote>
     * <p>If IdentityType is set to USER, this parameter is required.</p>
     * </blockquote>
     * 
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
