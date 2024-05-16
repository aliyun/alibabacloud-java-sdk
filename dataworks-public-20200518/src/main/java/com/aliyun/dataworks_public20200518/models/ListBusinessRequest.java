// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBusinessRequest extends TeaModel {
    /**
     * <p>The keyword that is used to perform a fuzzy match.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
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
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace name. You must configure either this parameter or ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static ListBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessRequest self = new ListBusinessRequest();
        return TeaModel.build(map, self);
    }

    public ListBusinessRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListBusinessRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBusinessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBusinessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListBusinessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
