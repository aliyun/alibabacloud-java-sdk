// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFoldersRequest extends TeaModel {
    /**
     * <p>The number of the page to return. This parameter is used for pagination.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The default value is 10. The maximum value is 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The path of the parent folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business_process/my_first_business_process/MaxCompute</p>
     */
    @NameInMap("ParentFolderPath")
    public String parentFolderPath;

    /**
     * <p>The ID of the DataWorks workspace. Log on to the DataWorks console and go to the Workspace Management page to obtain the workspace ID. You must set either this parameter or ProjectIdentifier to specify the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. Log on to the DataWorks console and go to the Workspace Management page to obtain the workspace name. You must set either this parameter or ProjectId to specify the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static ListFoldersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersRequest self = new ListFoldersRequest();
        return TeaModel.build(map, self);
    }

    public ListFoldersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFoldersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFoldersRequest setParentFolderPath(String parentFolderPath) {
        this.parentFolderPath = parentFolderPath;
        return this;
    }
    public String getParentFolderPath() {
        return this.parentFolderPath;
    }

    public ListFoldersRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListFoldersRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
