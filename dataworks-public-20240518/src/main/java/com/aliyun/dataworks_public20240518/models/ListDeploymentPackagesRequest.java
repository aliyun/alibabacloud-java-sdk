// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackagesRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the deployment package creator.</p>
     * 
     * <strong>example:</strong>
     * <p>110755000425****</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The maximum millisecond timestamp for when the deployment package was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1593877765000</p>
     */
    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    /**
     * <p>The maximum millisecond timestamp for when the deployment package started executing.</p>
     * 
     * <strong>example:</strong>
     * <p>1593877765000</p>
     */
    @NameInMap("EndExecuteTime")
    public Long endExecuteTime;

    /**
     * <p>The Alibaba Cloud account ID of the deployment package executor.</p>
     * 
     * <strong>example:</strong>
     * <p>2003****</p>
     */
    @NameInMap("Executor")
    public String executor;

    /**
     * <p>The keyword in the deployment package name. DataWorks supports fuzzy matching, meaning you can enter a keyword to query for deployment packages that contain it.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the workspace configuration page to query the ID. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10003</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace, which is the identifier at the top of the Data Studio page where you switch workspaces. Either this parameter or ProjectId must be specified to determine which DataWorks workspace this API call operates on.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The status of the deployment package. Valid values:</p>
     * <ul>
     * <li>0: It is ready.</li>
     * <li>1: It was successfully deployed.</li>
     * <li>2: It failed to be deployed.</li>
     * <li>6: It was rejected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ListDeploymentPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPackagesRequest self = new ListDeploymentPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPackagesRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListDeploymentPackagesRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public ListDeploymentPackagesRequest setEndExecuteTime(Long endExecuteTime) {
        this.endExecuteTime = endExecuteTime;
        return this;
    }
    public Long getEndExecuteTime() {
        return this.endExecuteTime;
    }

    public ListDeploymentPackagesRequest setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public ListDeploymentPackagesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDeploymentPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeploymentPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeploymentPackagesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDeploymentPackagesRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public ListDeploymentPackagesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
