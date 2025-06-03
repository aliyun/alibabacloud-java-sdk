// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackageFilesShrinkRequest extends TeaModel {
    /**
     * <p>The workflow ID. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to query the workflow ID by name.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("BusinessId")
    public Long businessId;

    /**
     * <p>The change type. Valid values:</p>
     * <ul>
     * <li>0: addition</li>
     * <li>1: update</li>
     * <li>2: deletion</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ChangeType")
    public Integer changeType;

    /**
     * <p>The start date for committing. Specify the date in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01</p>
     */
    @NameInMap("CommitFrom")
    public String commitFrom;

    /**
     * <p>The end date (included) for committing. Specify the date in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-31</p>
     */
    @NameInMap("CommitTo")
    public String commitTo;

    /**
     * <p>The ID of the user who commits the file.</p>
     * 
     * <strong>example:</strong>
     * <p>2003****</p>
     */
    @NameInMap("CommitUserId")
    public String commitUserId;

    /**
     * <p>The IDs of the files to be queried.</p>
     */
    @NameInMap("FileIds")
    public String fileIdsShrink;

    /**
     * <p>The name of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>Filename</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The type of the code for the file.</p>
     * <p>The code for files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>. You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the type of the code for the file.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

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
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The solution ID.</p>
     * 
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
