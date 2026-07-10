// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseOrgMembershipRequest extends TeaModel {
    /**
     * <p>The Langfuse instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lfs-****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The email address of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:john@company.com">john@company.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The Langfuse organization ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cmrbhzx930005jw2q****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The role of the user in the organization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN</p>
     */
    @NameInMap("Role")
    public String role;

    public static ModifyLangfuseOrgMembershipRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseOrgMembershipRequest self = new ModifyLangfuseOrgMembershipRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseOrgMembershipRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyLangfuseOrgMembershipRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyLangfuseOrgMembershipRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ModifyLangfuseOrgMembershipRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLangfuseOrgMembershipRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
