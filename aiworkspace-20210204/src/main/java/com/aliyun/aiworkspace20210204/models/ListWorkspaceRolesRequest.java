// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspaceRolesRequest extends TeaModel {
    /**
     * <p>The sort order for the specified sort field. Valid values:</p>
     * <ul>
     * <li><p><code>ASC</code> (default): Ascending order.</p>
     * </li>
     * <li><p><code>DESC</code>: Descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A comma-separated list of role IDs.</p>
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
     * <p>The role type.</p>
     * <ul>
     * <li><code>custom</code>: A custom role.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The sort field for paginated queries. Valid values:</p>
     * <ul>
     * <li><p><code>GmtCreateTime</code> (default): Sorts by creation time.</p>
     * </li>
     * <li><p><code>GmtModifiedTime</code>: Sorts by modification time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><p><code>Creating</code></p>
     * </li>
     * <li><p><code>Updating</code></p>
     * </li>
     * <li><p><code>Deleting</code></p>
     * </li>
     * <li><p><code>Succeeded</code>: A terminal state.</p>
     * </li>
     * <li><p><code>Failed</code>: A terminal state.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A comma-separated list of fields to return. Currently, only <code>ModulePermissions</code> is supported, which returns the permission configuration of the role.</p>
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
