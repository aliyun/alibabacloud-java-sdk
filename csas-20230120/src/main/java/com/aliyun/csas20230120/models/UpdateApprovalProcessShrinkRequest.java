// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessShrinkRequest extends TeaModel {
    @NameInMap("ApprovalType")
    public Integer approvalType;

    @NameInMap("Description")
    public String description;

    @NameInMap("EventLabel")
    public String eventLabel;

    @NameInMap("ExternalConfig")
    public String externalConfig;

    @NameInMap("MatchSchemaConfigs")
    public String matchSchemaConfigsShrink;

    @NameInMap("MatchSchemas")
    public String matchSchemasShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-f16bf74b2b29****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("ProcessNodes")
    public java.util.List<java.util.List<String>> processNodes;

    public static UpdateApprovalProcessShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessShrinkRequest self = new UpdateApprovalProcessShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessShrinkRequest setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public Integer getApprovalType() {
        return this.approvalType;
    }

    public UpdateApprovalProcessShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApprovalProcessShrinkRequest setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }
    public String getEventLabel() {
        return this.eventLabel;
    }

    public UpdateApprovalProcessShrinkRequest setExternalConfig(String externalConfig) {
        this.externalConfig = externalConfig;
        return this;
    }
    public String getExternalConfig() {
        return this.externalConfig;
    }

    public UpdateApprovalProcessShrinkRequest setMatchSchemaConfigsShrink(String matchSchemaConfigsShrink) {
        this.matchSchemaConfigsShrink = matchSchemaConfigsShrink;
        return this;
    }
    public String getMatchSchemaConfigsShrink() {
        return this.matchSchemaConfigsShrink;
    }

    public UpdateApprovalProcessShrinkRequest setMatchSchemasShrink(String matchSchemasShrink) {
        this.matchSchemasShrink = matchSchemasShrink;
        return this;
    }
    public String getMatchSchemasShrink() {
        return this.matchSchemasShrink;
    }

    public UpdateApprovalProcessShrinkRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public UpdateApprovalProcessShrinkRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public UpdateApprovalProcessShrinkRequest setProcessNodes(java.util.List<java.util.List<String>> processNodes) {
        this.processNodes = processNodes;
        return this;
    }
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

}
