// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateManualDagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("DagParameters")
    public String dagParameters;

    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    @NameInMap("NodeParameters")
    public String nodeParameters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static CreateManualDagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagRequest self = new CreateManualDagRequest();
        return TeaModel.build(map, self);
    }

    public CreateManualDagRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public CreateManualDagRequest setDagParameters(String dagParameters) {
        this.dagParameters = dagParameters;
        return this;
    }
    public String getDagParameters() {
        return this.dagParameters;
    }

    public CreateManualDagRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    public CreateManualDagRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateManualDagRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public CreateManualDagRequest setNodeParameters(String nodeParameters) {
        this.nodeParameters = nodeParameters;
        return this;
    }
    public String getNodeParameters() {
        return this.nodeParameters;
    }

    public CreateManualDagRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public CreateManualDagRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
