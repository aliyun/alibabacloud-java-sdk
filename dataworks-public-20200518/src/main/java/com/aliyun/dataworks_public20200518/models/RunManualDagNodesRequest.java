// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunManualDagNodesRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("FlowName")
    @Validation(required = true)
    public String flowName;

    @NameInMap("BizDate")
    @Validation(required = true)
    public String bizDate;

    @NameInMap("NodeParameters")
    public String nodeParameters;

    @NameInMap("DagParameters")
    public String dagParameters;

    public static RunManualDagNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunManualDagNodesRequest self = new RunManualDagNodesRequest();
        return TeaModel.build(map, self);
    }

    public RunManualDagNodesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public RunManualDagNodesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RunManualDagNodesRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public RunManualDagNodesRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public RunManualDagNodesRequest setNodeParameters(String nodeParameters) {
        this.nodeParameters = nodeParameters;
        return this;
    }
    public String getNodeParameters() {
        return this.nodeParameters;
    }

    public RunManualDagNodesRequest setDagParameters(String dagParameters) {
        this.dagParameters = dagParameters;
        return this;
    }
    public String getDagParameters() {
        return this.dagParameters;
    }

}
