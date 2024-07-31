// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileTypeRequest extends TeaModel {
    /**
     * <p>The name of the node type. You can log on to the DataWorks console, go to the DataStudio page, and then view the name of a specific node type on the left side of the page. Take note of the following items when you configure this parameter:</p>
     * <ul>
     * <li>You can view the name of a specific node type, but the language specified by this parameter to present the name must be the same as the language specified by the Locale parameter.</li>
     * <li>Fuzzy match is supported.</li>
     * <li>If this parameter is not configured, the names of all node types are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ODPS SQL</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language that you use for the query. Valid values: zh-CN and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to view the workspace ID. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace page to view the workspace name. You must configure either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static ListFileTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileTypeRequest self = new ListFileTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListFileTypeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListFileTypeRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public ListFileTypeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFileTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFileTypeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListFileTypeRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
