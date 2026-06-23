// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectRolesShrinkRequest extends TeaModel {
    /**
     * <p>An array of workspace role codes.</p>
     */
    @NameInMap("Codes")
    public String codesShrink;

    /**
     * <p>An array of workspace role names.</p>
     */
    @NameInMap("Names")
    public String namesShrink;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can find the ID on the Workspace Management page in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>This parameter specifies the DataWorks workspace for which you want to list roles.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21229</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the workspace role.</p>
     * <ul>
     * <li><p><code>UserCustom</code>: Custom Role</p>
     * </li>
     * <li><p><code>System</code>: System Role</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListProjectRolesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesShrinkRequest self = new ListProjectRolesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesShrinkRequest setCodesShrink(String codesShrink) {
        this.codesShrink = codesShrink;
        return this;
    }
    public String getCodesShrink() {
        return this.codesShrink;
    }

    public ListProjectRolesShrinkRequest setNamesShrink(String namesShrink) {
        this.namesShrink = namesShrink;
        return this;
    }
    public String getNamesShrink() {
        return this.namesShrink;
    }

    public ListProjectRolesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectRolesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectRolesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListProjectRolesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
