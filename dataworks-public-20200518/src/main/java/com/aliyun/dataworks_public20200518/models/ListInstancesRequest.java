// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The parameters related to the node.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 00:00:00</p>
     */
    @NameInMap("BeginBizdate")
    public String beginBizdate;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test_bizName</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 00:00:00</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-03 00:00:00</p>
     */
    @NameInMap("EndBizdate")
    public String endBizdate;

    /**
     * <p>Indicates whether the instance is associated with a monitoring rule in Data Quality. Valid values:</p>
     * <ul>
     * <li>0: The instance is associated with a monitoring rule in Data Quality.</li>
     * <li>1: The instance is not associated with a monitoring rule in Data Quality.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>Indicates whether the node can be rerun.</p>
     * 
     * <strong>example:</strong>
     * <p>openmr_8****</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The sorting rule of the instances to be returned. Valid values:</p>
     * <ul>
     * <li>CREATE_TIME_DESC: The instances are sorted in descending order of their creation time.</li>
     * <li>INSTANCE_ID_DESC (default): The instances are sorted in descending order of their IDs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE_ID_DESC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The connection string.</p>
     * 
     * <strong>example:</strong>
     * <p>193379****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The operation that you want to perform.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS_SQL</p>
     */
    @NameInMap("ProgramType")
    public String programType;

    /**
     * <p>The environment in which the node runs. Valid values: DEV and PROD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the baseline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The status of the node. Valid values:</p>
     * <ul>
     * <li>NOT_RUN: The node is not run.</li>
     * <li>WAIT_TIME: The node is waiting for the scheduling time to arrive.</li>
     * <li>WAIT_RESOURCE: The node is waiting for resources.</li>
     * <li>RUNNING: The node is running.</li>
     * <li>CHECKING: Data quality is being checked for the node.</li>
     * <li>CHECKING_CONDITION: Branch conditions are being checked for the node.</li>
     * <li>FAILURE: The node fails to run.</li>
     * <li>SUCCESS: The node is successfully run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NOT_RUN</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setBeginBizdate(String beginBizdate) {
        this.beginBizdate = beginBizdate;
        return this;
    }
    public String getBeginBizdate() {
        return this.beginBizdate;
    }

    public ListInstancesRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ListInstancesRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public ListInstancesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListInstancesRequest setEndBizdate(String endBizdate) {
        this.endBizdate = endBizdate;
        return this;
    }
    public String getEndBizdate() {
        return this.endBizdate;
    }

    public ListInstancesRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListInstancesRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListInstancesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListInstancesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setProgramType(String programType) {
        this.programType = programType;
        return this;
    }
    public String getProgramType() {
        return this.programType;
    }

    public ListInstancesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
