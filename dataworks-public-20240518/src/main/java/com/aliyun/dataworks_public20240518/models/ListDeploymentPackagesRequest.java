// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackagesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>110755000425****</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>1593877765000</p>
     */
    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    /**
     * <strong>example:</strong>
     * <p>1593877765000</p>
     */
    @NameInMap("EndExecuteTime")
    public Long endExecuteTime;

    /**
     * <strong>example:</strong>
     * <p>2003****</p>
     */
    @NameInMap("Executor")
    public String executor;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>10003</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
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
