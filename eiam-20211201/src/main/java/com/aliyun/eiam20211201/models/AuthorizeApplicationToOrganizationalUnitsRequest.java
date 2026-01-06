// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToOrganizationalUnitsRequest extends TeaModel {
    /**
     * <p>The ID of the application on which you want to grant permissions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用角色ID。</p>
     * 
     * <strong>example:</strong>
     * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
     */
    @NameInMap("ApplicationRoleId")
    public String applicationRoleId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk2676xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the organizations to which you want to grant permissions. You can grant permissions to a maximum of 100 organizations at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static AuthorizeApplicationToOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToOrganizationalUnitsRequest self = new AuthorizeApplicationToOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToOrganizationalUnitsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AuthorizeApplicationToOrganizationalUnitsRequest setApplicationRoleId(String applicationRoleId) {
        this.applicationRoleId = applicationRoleId;
        return this;
    }
    public String getApplicationRoleId() {
        return this.applicationRoleId;
    }

    public AuthorizeApplicationToOrganizationalUnitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthorizeApplicationToOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}
