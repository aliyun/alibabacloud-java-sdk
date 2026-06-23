// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectMembersShrinkRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. To obtain this ID, log in to the <a href="https://workbench.data.aliyun.com/console">DataWorks Console</a> and go to the Workspace Management page.</p>
     * <p>This parameter specifies the DataWorks workspace for the API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>62136</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>A list of role codes for the workspace to filter the results. You can call the <a href="https://help.aliyun.com/document_detail/2853930.html">ListProjectRoles</a> operation to obtain the role codes.</p>
     */
    @NameInMap("RoleCodes")
    public String roleCodesShrink;

    /**
     * <p>A list of DataWorks user IDs to filter the results. You can find these IDs on the <a href="https://dataworks.console.aliyun.com/product/ms_menu">Tenant Members and Roles</a> page in the Management Center.</p>
     */
    @NameInMap("UserIds")
    public String userIdsShrink;

    public static ListProjectMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersShrinkRequest self = new ListProjectMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectMembersShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectMembersShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListProjectMembersShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public ListProjectMembersShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

}
