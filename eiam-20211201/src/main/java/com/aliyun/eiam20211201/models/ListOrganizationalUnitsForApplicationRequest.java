// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to query.</p>
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
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the organizations that are allowed to access the application. You can query a maximum of 100 organization IDs at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListOrganizationalUnitsForApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForApplicationRequest self = new ListOrganizationalUnitsForApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListOrganizationalUnitsForApplicationRequest setApplicationRoleId(String applicationRoleId) {
        this.applicationRoleId = applicationRoleId;
        return this;
    }
    public String getApplicationRoleId() {
        return this.applicationRoleId;
    }

    public ListOrganizationalUnitsForApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOrganizationalUnitsForApplicationRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public ListOrganizationalUnitsForApplicationRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOrganizationalUnitsForApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
