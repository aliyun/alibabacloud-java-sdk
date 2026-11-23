// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspaceRolesRequest extends TeaModel {
    /**
     * <p>The sorting order for the specified sorting field in paging. Valid values:</p>
     * <ul>
     * <li>ASC: Ascending order. Default value.</li>
     * <li>DESC: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of role IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>role-dhg*******</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The role name.</p>
     * 
     * <strong>example:</strong>
     * <p>dev-test</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The role type. Valid values:</p>
     * <ul>
     * <li>custom: custom role.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The sorting field for paging. Valid values:</p>
     * <ul>
     * <li>GmtCreateTime: Sort by creation time. Default value.</li>
     * <li>GmtModifiedTime: Sort by modification time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p><strong>[Deprecated]</strong> The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The comma-separated list of fields to return. Currently, only ModulePermissions is supported, which indicates whether to return the permission configurations of the role.</p>
     * 
     * <strong>example:</strong>
     * <p>ModulePermissions</p>
     */
    @NameInMap("VerboseFields")
    public String verboseFields;

    public static ListWorkspaceRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRolesRequest self = new ListWorkspaceRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRolesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListWorkspaceRolesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkspaceRolesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkspaceRolesRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

    public ListWorkspaceRolesRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ListWorkspaceRolesRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public ListWorkspaceRolesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListWorkspaceRolesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListWorkspaceRolesRequest setVerboseFields(String verboseFields) {
        this.verboseFields = verboseFields;
        return this;
    }
    public String getVerboseFields() {
        return this.verboseFields;
    }

}
