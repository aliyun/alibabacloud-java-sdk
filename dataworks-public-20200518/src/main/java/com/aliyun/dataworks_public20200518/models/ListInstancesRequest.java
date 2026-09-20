// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The start date for which to retrieve the instance list. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 00:00:00</p>
     */
    @NameInMap("BeginBizdate")
    public String beginBizdate;

    /**
     * <p>The name of the workflow. You can call <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> to query workflow information.</p>
     * 
     * <strong>example:</strong>
     * <p>test_bizName</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The date for which to retrieve the instance list. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 00:00:00</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The DAG ID. The DagId can be the DagId returned by operations such as <a href="https://help.aliyun.com/document_detail/212961.html">RunCycleDagNodes</a> for data backfill, <a href="https://help.aliyun.com/document_detail/212949.html">RunSmokeTest</a> for smoke testing, and <a href="https://help.aliyun.com/document_detail/212830.html">RunManualDagNodes</a> for manual workflows.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The end date for which to retrieve the instance list. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-03 00:00:00</p>
     */
    @NameInMap("EndBizdate")
    public String endBizdate;

    /**
     * <p>The node ID. You can call <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> to query the node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The node name. You can call <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> to query the node name.</p>
     * 
     * <strong>example:</strong>
     * <p>openmr_8****</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The sorting rule for the returned results. Valid values:</p>
     * <ul>
     * <li>CREATE_TIME_DESC: sorted by creation time in descending order.</li>
     * <li>INSTANCE_ID_DESC: default value. Sorted by instance ID in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE_ID_DESC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The ID of the owner, which is the UID of the workspace administrator. You can logon to the Alibaba Cloud Management Console and view the UID in the Security Settings section of the storage management page.</p>
     * 
     * <strong>example:</strong>
     * <p>193379****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Minimum value: 1. Maximum value: 100.</p>
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
     * <p>The node type. You can call <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> to query the node type.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS_SQL</p>
     */
    @NameInMap("ProgramType")
    public String programType;

    /**
     * <p>The runtime environment. Valid values:</p>
     * <ul>
     * <li>PROD: production environment.</li>
     * <li>DEV: development environment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> to query the workspace ID.</p>
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
     * <li><p>NOT_RUN: The node is not run.</p>
     * </li>
     * <li><p>WAIT_TIME: The node is waiting for the scheduled time (DueTime or CycTime) to arrive.</p>
     * </li>
     * <li><p>WAIT_RESOURCE: The node is waiting for resources.</p>
     * </li>
     * <li><p>RUNNING: The node is running.</p>
     * </li>
     * <li><p>CHECKING: The node has been sent to Data Quality for data validation.</p>
     * </li>
     * <li><p>CHECKING_CONDITION: The node is undergoing branch condition verification.</p>
     * </li>
     * <li><p>FAILURE: Failed to execute.</p>
     * </li>
     * <li><p>SUCCESS: Execute successfully.</p>
     * </li>
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
