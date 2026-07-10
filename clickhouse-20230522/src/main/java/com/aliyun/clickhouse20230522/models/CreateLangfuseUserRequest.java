// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseUserRequest extends TeaModel {
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
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>john</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The role of the user in the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>VIEWER</p>
     */
    @NameInMap("OrgRole")
    public String orgRole;

    /**
     * <p>The Langfuse organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cmrbhzx930005jw2q****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>The password of the user account. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>Contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>The following special characters are supported: !@#$%^&amp;*()_+-=</p>
     * </li>
     * <li><p>The password must be 8 to 32 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2F9e9@******</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateLangfuseUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseUserRequest self = new CreateLangfuseUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseUserRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateLangfuseUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateLangfuseUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLangfuseUserRequest setOrgRole(String orgRole) {
        this.orgRole = orgRole;
        return this;
    }
    public String getOrgRole() {
        return this.orgRole;
    }

    public CreateLangfuseUserRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateLangfuseUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateLangfuseUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
