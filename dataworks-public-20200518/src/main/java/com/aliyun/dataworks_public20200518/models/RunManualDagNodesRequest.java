// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunManualDagNodesRequest extends TeaModel {
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("DagParameters")
    public String dagParameters;

    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    @NameInMap("NodeParameters")
    public String nodeParameters;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

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

}
