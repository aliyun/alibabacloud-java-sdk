// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackageFilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("BusinessId")
    public Long businessId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ChangeType")
    public Integer changeType;

    /**
     * <strong>example:</strong>
     * <p>2025-01-01</p>
     */
    @NameInMap("CommitFrom")
    public String commitFrom;

    /**
     * <strong>example:</strong>
     * <p>2025-01-31</p>
     */
    @NameInMap("CommitTo")
    public String commitTo;

    /**
     * <strong>example:</strong>
     * <p>2003****</p>
     */
    @NameInMap("CommitUserId")
    public String commitUserId;

    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    /**
     * <strong>example:</strong>
     * <p>Filename</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>8065</p>
     */
    @NameInMap("SolutionId")
    public Long solutionId;

    public static ListDeploymentPackageFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPackageFilesRequest self = new ListDeploymentPackageFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPackageFilesRequest setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public ListDeploymentPackageFilesRequest setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }
    public Integer getChangeType() {
        return this.changeType;
    }

    public ListDeploymentPackageFilesRequest setCommitFrom(String commitFrom) {
        this.commitFrom = commitFrom;
        return this;
    }
    public String getCommitFrom() {
        return this.commitFrom;
    }

    public ListDeploymentPackageFilesRequest setCommitTo(String commitTo) {
        this.commitTo = commitTo;
        return this;
    }
    public String getCommitTo() {
        return this.commitTo;
    }

    public ListDeploymentPackageFilesRequest setCommitUserId(String commitUserId) {
        this.commitUserId = commitUserId;
        return this;
    }
    public String getCommitUserId() {
        return this.commitUserId;
    }

    public ListDeploymentPackageFilesRequest setFileIds(java.util.List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    public ListDeploymentPackageFilesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListDeploymentPackageFilesRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public ListDeploymentPackageFilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeploymentPackageFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeploymentPackageFilesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDeploymentPackageFilesRequest setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

}
