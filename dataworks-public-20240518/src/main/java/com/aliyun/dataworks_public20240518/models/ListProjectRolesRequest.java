// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectRolesRequest extends TeaModel {
    /**
     * <p>The list of workspace role codes.</p>
     */
    @NameInMap("Codes")
    public java.util.List<String> codes;

    /**
     * <p>The list of workspace role names.</p>
     */
    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <p>The page number. Used for paging.</p>
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
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API invoke operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21229</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the workspace role. Valid values:</p>
     * <ul>
     * <li>UserCustom: user-defined role.</li>
     * <li>System: system role.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListProjectRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesRequest self = new ListProjectRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesRequest setCodes(java.util.List<String> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.List<String> getCodes() {
        return this.codes;
    }

    public ListProjectRolesRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListProjectRolesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectRolesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectRolesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListProjectRolesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
