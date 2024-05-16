// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunManualDagNodesRequest extends TeaModel {
    /**
     * <p>The parameters transmitted between nodes in the manually triggered workflow. The parameters are in the following JSON format: { "\\<ID of a node in the manually triggered workflow>": "Scheduling parameter settings of the node, which are in the same format as the Parameters parameter on the Properties tab of the DataStudio page", "\\<ID of a node in the manually triggered workflow>": "Scheduling parameter settings of the node, which are in the same format as the Parameters parameter on the Properties tab of the DataStudio page" }.</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The IDs of the nodes that you need to run in the manually triggered workflow. Separate multiple node IDs with commas (,). You can call the ListNodes operation to query the node IDs.</p>
     */
    @NameInMap("DagParameters")
    public String dagParameters;

    @NameInMap("EndBizDate")
    public String endBizDate;

    /**
     * <p>The ID of the workspace to which the manually triggered workflow belongs.</p>
     */
    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>The data timestamp. The value must be one or more days before the current date. For example, if the current date is November 11, 2020, set the value to 2020-11-10 00:00:00 or earlier. Specify this parameter in the YYYY-MM-DD 00:00:00 format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The IDs of the nodes that you do not need to run in the manually triggered workflow. The system generates dry-run instances for all these nodes. After the dry-run instances are scheduled, the states of these instances are directly set to successful, but the scripts are not run. Separate multiple node IDs with commas (,).</p>
     */
    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    /**
     * <p>The parameters of the manually triggered workflow, which are synchronized to all the instances in the directed acyclic graph (DAG) of the workflow. If a workflow parameter specified in DagParameters is referenced as a scheduling parameter of a node, the value of the scheduling parameter is replaced with the value of the workflow parameter.</p>
     */
    @NameInMap("NodeParameters")
    public String nodeParameters;

    /**
     * <p>The name of the workspace to which the manually triggered workflow belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the DAG for the manually triggered workflow. You can call an operation with this parameter as a request parameter to query the details and statuses of the nodes in this manually triggered workflow.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the manually triggered workflow.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("StartBizDate")
    public String startBizDate;

    public static RunManualDagNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunManualDagNodesRequest self = new RunManualDagNodesRequest();
        return TeaModel.build(map, self);
    }

    public RunManualDagNodesRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public RunManualDagNodesRequest setDagParameters(String dagParameters) {
        this.dagParameters = dagParameters;
        return this;
    }
    public String getDagParameters() {
        return this.dagParameters;
    }

    public RunManualDagNodesRequest setEndBizDate(String endBizDate) {
        this.endBizDate = endBizDate;
        return this;
    }
    public String getEndBizDate() {
        return this.endBizDate;
    }

    public RunManualDagNodesRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    public RunManualDagNodesRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public RunManualDagNodesRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public RunManualDagNodesRequest setNodeParameters(String nodeParameters) {
        this.nodeParameters = nodeParameters;
        return this;
    }
    public String getNodeParameters() {
        return this.nodeParameters;
    }

    public RunManualDagNodesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public RunManualDagNodesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RunManualDagNodesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RunManualDagNodesRequest setStartBizDate(String startBizDate) {
        this.startBizDate = startBizDate;
        return this;
    }
    public String getStartBizDate() {
        return this.startBizDate;
    }

}
