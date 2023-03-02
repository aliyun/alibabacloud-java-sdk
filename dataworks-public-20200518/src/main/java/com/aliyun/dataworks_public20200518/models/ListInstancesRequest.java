// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("BeginBizdate")
    public String beginBizdate;

    /**
     * <p>The name of the workflow. You can call the [ListBusiness](~~173945~~) operation to query the name of the workflow.</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The data timestamp of the instances that you want to query. Specify the timestamp in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The ID of the directed acyclic graph (DAG). You can set this parameter to the value of the DagId parameter returned by the [RunCycleDagNodes](~~212961~~), [RunSmokeTest](~~212949~~), or [RunManualDagNodes](~~212830~~) operation based on your business requirements. The RunManualDagNodes operation is used to backfill data, the RunSmokeTest operation is used to perform smoke testing, and the RunManualDagNodes operation is used to run nodes in a manually triggered workflow.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("EndBizdate")
    public String endBizdate;

    /**
     * <p>The ID of the node. You can call the [ListNodes](~~173979~~) operation to query the ID of the node.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The name of the node. You can call the [ListNodes](~~173979~~) operation to query the name of the node.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The ID of the Alibaba Cloud account used by the workspace administrator. You can log on to the Alibaba Cloud Management Console and view the ID on the Security Settings page of the Account Center console.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of the page to return. Minimum value:1. Maximum value: 100.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * <br>
     * <p>You cannot specify the sorting method for the instances to be returned by this operation. By default, the instances are sorted in descending order of the time when the instances were created.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the node. You can call the [ListNodes](~~173979~~) operation to query the type of the node.</p>
     */
    @NameInMap("ProgramType")
    public String programType;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the workspace. You can call the [ListProjects](~~178393~~) operation to query the ID of the workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The status of the node. Valid values:</p>
     * <br>
     * <p>*   NOT_RUN: The node is not run.</p>
     * <p>*   WAIT_TIME: The node is waiting for the scheduling time to arrive.</p>
     * <p>*   WAIT_RESOURCE: The node is waiting for resources.</p>
     * <p>*   RUNNING: The node is running.</p>
     * <p>*   CHECKING: Data quality is being checked for the node.</p>
     * <p>*   CHECKING_CONDITION: Branch conditions are being checked for the node.</p>
     * <p>*   FAILURE: The node fails to run.</p>
     * <p>*   SUCCESS: The node is successfully run.</p>
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
