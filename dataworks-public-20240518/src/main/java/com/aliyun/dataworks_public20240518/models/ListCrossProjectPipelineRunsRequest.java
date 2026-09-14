// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectPipelineRunsRequest extends TeaModel {
    /**
     * <p>The start of the creation time range. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1788739200000</p>
     */
    @NameInMap("CreateTimeFrom")
    public Long createTimeFrom;

    /**
     * <p>The end of the creation time range. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1788825599999</p>
     */
    @NameInMap("CreateTimeTo")
    public Long createTimeTo;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>creator</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The cross-workspace publish environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("DeploymentEnvironmentId")
    public Long deploymentEnvironmentId;

    /**
     * <p>The executor.</p>
     * 
     * <strong>example:</strong>
     * <p>executor</p>
     */
    @NameInMap("Executor")
    public String executor;

    /**
     * <p>The publish object ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The publish object type.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS_SQL</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The publish flow status. Valid values:</p>
     * <ul>
     * <li>Building: Building.</li>
     * <li>Ready: Ready and waiting for execution.</li>
     * <li>Running: Running.</li>
     * <li>Termination: Terminated.</li>
     * <li>Success: Succeeded.</li>
     * <li>Fail: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCrossProjectPipelineRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectPipelineRunsRequest self = new ListCrossProjectPipelineRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectPipelineRunsRequest setCreateTimeFrom(Long createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    public ListCrossProjectPipelineRunsRequest setCreateTimeTo(Long createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    public ListCrossProjectPipelineRunsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListCrossProjectPipelineRunsRequest setDeploymentEnvironmentId(Long deploymentEnvironmentId) {
        this.deploymentEnvironmentId = deploymentEnvironmentId;
        return this;
    }
    public Long getDeploymentEnvironmentId() {
        return this.deploymentEnvironmentId;
    }

    public ListCrossProjectPipelineRunsRequest setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public ListCrossProjectPipelineRunsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListCrossProjectPipelineRunsRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListCrossProjectPipelineRunsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCrossProjectPipelineRunsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCrossProjectPipelineRunsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCrossProjectPipelineRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
