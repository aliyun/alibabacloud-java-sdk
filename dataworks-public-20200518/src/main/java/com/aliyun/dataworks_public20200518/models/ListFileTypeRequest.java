// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileTypeRequest extends TeaModel {
    /**
     * <p>The name of the node type. You can log on to the DataWorks console, go to the DataStudio page, and then view the name of a specific node type on the left side of the page. Take note of the following items when you use this parameter:</p>
     * <br>
     * <p>*   You can view the English or Chinese name of a specific node type, but the language specified by this parameter to present the name must be the same as the language specified by the Locale parameter.</p>
     * <p>*   Fuzzy match is supported.</p>
     * <p>*   If this parameter is not specified, the names of all node types are returned.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language that you use for the query. Valid values: zh-CN and en-US.</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace ID. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace name.</p>
     * <br>
     * <p>You must configure either the ProjectId or ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
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
