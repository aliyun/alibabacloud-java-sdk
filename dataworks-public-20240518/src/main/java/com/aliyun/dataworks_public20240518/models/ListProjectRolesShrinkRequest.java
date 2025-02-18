// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectRolesShrinkRequest extends TeaModel {
    /**
     * <p>The codes of roles in the DataWorks workspace.</p>
     */
    @NameInMap("Codes")
    public String codesShrink;

    /**
     * <p>The names of roles in the DataWorks workspace.</p>
     */
    @NameInMap("Names")
    public String namesShrink;

    /**
     * <p>The page number.</p>
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
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21229</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the role. Valid values:</p>
     * <ul>
     * <li>UserCustom: user-defined role</li>
     * <li>System: system role</li>
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
