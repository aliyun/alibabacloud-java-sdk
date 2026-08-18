// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFileVersionsRequest extends TeaModel {
    /**
     * <p>The ID of the file. You can call <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> to query the file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("FileId")
    public Long fileId;

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
     * <p>The ID of the DataWorks workspace. You can click the small wrench icon in the upper-right corner of the page to go to the storage management page and view the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace, which is the English identifier displayed in the workspace switcher at the top of the DataStudio page.</p>
     * <p>You must set either this parameter or ProjectId to determine the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static ListFileVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileVersionsRequest self = new ListFileVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFileVersionsRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public ListFileVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFileVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFileVersionsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListFileVersionsRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
