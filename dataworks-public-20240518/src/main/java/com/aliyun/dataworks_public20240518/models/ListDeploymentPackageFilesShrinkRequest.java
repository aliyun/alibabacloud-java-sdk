// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackageFilesShrinkRequest extends TeaModel {
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
    public String fileIdsShrink;

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

    public static ListDeploymentPackageFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPackageFilesShrinkRequest self = new ListDeploymentPackageFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPackageFilesShrinkRequest setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public ListDeploymentPackageFilesShrinkRequest setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }
    public Integer getChangeType() {
        return this.changeType;
    }

    public ListDeploymentPackageFilesShrinkRequest setCommitFrom(String commitFrom) {
        this.commitFrom = commitFrom;
        return this;
    }
    public String getCommitFrom() {
        return this.commitFrom;
    }

    public ListDeploymentPackageFilesShrinkRequest setCommitTo(String commitTo) {
        this.commitTo = commitTo;
        return this;
    }
    public String getCommitTo() {
        return this.commitTo;
    }

    public ListDeploymentPackageFilesShrinkRequest setCommitUserId(String commitUserId) {
        this.commitUserId = commitUserId;
        return this;
    }
    public String getCommitUserId() {
        return this.commitUserId;
    }

    public ListDeploymentPackageFilesShrinkRequest setFileIdsShrink(String fileIdsShrink) {
        this.fileIdsShrink = fileIdsShrink;
        return this;
    }
    public String getFileIdsShrink() {
        return this.fileIdsShrink;
    }

    public ListDeploymentPackageFilesShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListDeploymentPackageFilesShrinkRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public ListDeploymentPackageFilesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeploymentPackageFilesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeploymentPackageFilesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDeploymentPackageFilesShrinkRequest setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

}
