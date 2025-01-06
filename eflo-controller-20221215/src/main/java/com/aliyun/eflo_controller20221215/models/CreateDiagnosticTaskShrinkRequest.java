// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateDiagnosticTaskShrinkRequest extends TeaModel {
    /**
     * <p>Log information</p>
     */
    @NameInMap("AiJobLogInfo")
    public String aiJobLogInfoShrink;

    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>i118913031696573280136</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Diagnostic type.</p>
     * 
     * <strong>example:</strong>
     * <p>CheckByAiJobLogs</p>
     */
    @NameInMap("DiagnosticType")
    public String diagnosticType;

    /**
     * <p>List of node IDs</p>
     */
    @NameInMap("NodeIds")
    public String nodeIdsShrink;

    public static CreateDiagnosticTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticTaskShrinkRequest self = new CreateDiagnosticTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticTaskShrinkRequest setAiJobLogInfoShrink(String aiJobLogInfoShrink) {
        this.aiJobLogInfoShrink = aiJobLogInfoShrink;
        return this;
    }
    public String getAiJobLogInfoShrink() {
        return this.aiJobLogInfoShrink;
    }

    public CreateDiagnosticTaskShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateDiagnosticTaskShrinkRequest setDiagnosticType(String diagnosticType) {
        this.diagnosticType = diagnosticType;
        return this;
    }
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    public CreateDiagnosticTaskShrinkRequest setNodeIdsShrink(String nodeIdsShrink) {
        this.nodeIdsShrink = nodeIdsShrink;
        return this;
    }
    public String getNodeIdsShrink() {
        return this.nodeIdsShrink;
    }

}
